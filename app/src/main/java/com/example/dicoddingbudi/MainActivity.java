package com.example.dicoddingbudi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements ProfileAdapter.ActionListener {

    private RecyclerView recyclerView;
    private ProfileAdapter profileAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);

        List<ProfileModel> list = ProfileData.getListData();
        setList(list);

        CircleImageView imageView = findViewById(R.id.gambar_akun);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AboutMeActivity.class));
            }
        });


    }

    private void setList(List<ProfileModel> list){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        profileAdapter = new ProfileAdapter(list,this);
        recyclerView.setAdapter(profileAdapter);
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void onActionClick(ProfileModel model) {
        Intent intent = new Intent(this,ProfileDetail.class);
        intent.putExtra("model",model);
        startActivity(intent);

    }
}

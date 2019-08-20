package com.example.dicoddingbudi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ProfileDetail extends AppCompatActivity {

    ImageView image;
    TextView name;
    TextView nama_asli;
    TextView ttl;
    TextView nama_beken;
    TextView nation;
    TextView profesi;
    TextView parent;
    TextView desc;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_details);
        image = findViewById(R.id.image);
        name = findViewById(R.id.nama);
        nama_asli = findViewById(R.id.nama_asli);
        ttl = findViewById(R.id.ttl);
        nama_beken = findViewById(R.id.nama_beken);
        nation = findViewById(R.id.nation);
        profesi = findViewById(R.id.profesi);
        parent = findViewById(R.id.parent);
        desc = findViewById(R.id.desc);

        ProfileModel model = (ProfileModel) getIntent().getSerializableExtra("model");
        setData(model);
    }

    private void setData(ProfileModel model){
        Log.e("ini nama", model.getImage());
        name.setText(model.getNama());
        nama_asli.setText(model.getNamaAsli());
        nama_beken.setText(model.getNamaBeken());
        ttl.setText(model.getTtl());
        nation.setText(model.getNationality());
        profesi.setText(model.getProfesi());
        parent.setText(model.getOrangTua());
        desc.setText(model.getDesc());
        Glide.with(this).load(model.getImage()).into(image);
    }
}

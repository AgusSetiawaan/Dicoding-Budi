package com.example.dicoddingbudi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);

        CircleImageView imageView = findViewById(R.id.my_photo);
        TextView myName = findViewById(R.id.my_name);
        TextView myEmail = findViewById(R.id.my_email);

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.foto));
        myName.setText("Hartanto Setiabudi");
        myEmail.setText("hartantosetiabudi@gmail.com");

    }
}

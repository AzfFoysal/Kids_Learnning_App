package com.example.kids_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        String name = getIntent().getStringExtra("name").replace("1", "n1").replace("2", "n2");
        ImageView iv = findViewById(R.id.imageView);

        int iid = getResources().getIdentifier(name, "drawable",getPackageName());
        iv.setImageResource(iid);
//
////        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();
//
//        int mid = getResources().getIdentifier(name, "raw",getPackageName());
//        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), mid);
//        mp.start();
    }
}
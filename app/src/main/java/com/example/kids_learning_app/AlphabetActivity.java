package com.example.kids_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class AlphabetActivity extends AppCompatActivity {

    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        String name = getIntent().getStringExtra("name").toLowerCase();
        ImageView iv = findViewById(R.id.imageView);

        int iid = getResources().getIdentifier(name, "drawable",getPackageName());
        iv.setImageResource(iid);

        /*Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();*/

        int mid = getResources().getIdentifier(name, "raw",getPackageName());
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), mid);
        mp.start();
    }
}
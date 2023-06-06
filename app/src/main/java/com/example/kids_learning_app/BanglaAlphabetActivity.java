package com.example.kids_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class BanglaAlphabetActivity extends AppCompatActivity {

    private Bundle savedInstanceState;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_alphabet);

        String name = getIntent().getStringExtra("name").replace("অ", "b1").replace("আ", "b2").replace("ই", "b3").replace("ঈ", "b4").replace("উ", "b5").replace("ঊ", "b6").replace("ঋ", "b7").replace("এ", "b8").replace("ঐ", "b9").replace("ও", "b10").replace("ঔ", "b11");
//        String name = getIntent().getStringExtra("name").replace("আ", "b");
//        Toast.makeText(this, name, Toast.LENGTH_LONG).show();

        ImageView iv = findViewById(R.id.imageView);
        int iid = getResources().getIdentifier(name, "drawable", getPackageName());
        iv.setImageResource(iid);

        
    }

}
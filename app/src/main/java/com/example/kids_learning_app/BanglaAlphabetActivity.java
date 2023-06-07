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

        String name = getIntent().getStringExtra("name").replace("অ", "b1").replace("আ", "b2").replace("ই", "b3").replace("ঈ", "b4").replace("উ", "b5").replace("ঊ", "b6")
                .replace("ঋ", "b7").replace("এ", "b8").replace("ঐ", "b9").replace("ও", "b10").replace("ঔ", "b11")
                .replace("ক", "b12").replace("খ", "b13").replace("গ", "b14").replace("ঘ", "b15").replace("ঙ", "b16")
                .replace("চ", "b17").replace("ছ", "b18").replace("জ", "b19").replace("ঝ", "b20").replace("ঞ", "b21")
                .replace("ট", "b22").replace("ঠ", "b23").replace("ড", "b24").replace("ঢ", "b25").replace("ণ", "b26")
                .replace("ত", "b27").replace("থ", "b28").replace("দ", "b29").replace("ধ", "b30").replace("ন", "b31")
                .replace("প", "b32").replace("ফ", "b33").replace("ব", "b34").replace("ভ", "b35").replace("ম", "b36")
                .replace("য", "b37").replace("র", "b38").replace("ল", "b39").replace("শ", "b40").replace("ষ", "b41")
                .replace("স", "b42").replace("হ", "b43").replace("ড়", "b44").replace("ঢ়", "b45").replace("য়", "b46")
                .replace("ৎ", "b47").replace("ং", "b48").replace("ঃ", "b49").replace("ঁ", "b50");




//       Toast.makeText(this, name, Toast.LENGTH_LONG).show();

        ImageView iv = findViewById(R.id.imageView);
        int iid = getResources().getIdentifier(name, "drawable", getPackageName());
        iv.setImageResource(iid);

        int mid = getResources().getIdentifier(name, "raw",getPackageName());
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), mid);
        mp.start();
    }
}
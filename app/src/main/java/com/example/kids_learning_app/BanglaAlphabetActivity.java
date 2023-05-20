package com.example.kids_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class BanglaAlphabetActivity extends AppCompatActivity {

    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_alphabet);

        String name = getIntent().getStringExtra("name");
        ImageView iv = findViewById(R.id.imageView2);

        int iid = getResources().getIdentifier(name, "drawable", getPackageName());
        iv.setImageResource(iid);
    }
}
package com.example.kids_learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class AlphabetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        String name = getIntent().getStringExtra("name").toLowerCase();
        ImageView iv = findViewById(R.id.imageView);

        int iid = getResources().getIdentifier(name, "drawable",getPackageName());
        iv.setImageResource(iid);

        /*Toast.makeText(getApplicationContext(),name,Toast.LENGTH_LONG).show();*/
    }
}
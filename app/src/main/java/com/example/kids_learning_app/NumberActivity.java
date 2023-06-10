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

        String name = getIntent().getStringExtra("name")
                .replace("0", "n0")
                .replace("1", "n1").replace("2", "n2").replace("3", "n3").replace("4", "n4").replace("5", "n5").replace("6", "n6").replace("7", "n7").replace("8", "n8").replace("9", "n9").replace("10", "n10")
                .replace("11", "n11").replace("12", "n12").replace("13", "n13").replace("14", "n14").replace("15", "n15").replace("16", "n16").replace("17", "n17").replace("18", "n18").replace("19", "n19").replace("20", "n20")
                .replace("21", "n21").replace("22", "n22").replace("23", "n23").replace("24", "n24").replace("25", "n25").replace("26", "n26").replace("27", "n27").replace("28", "n28").replace("29", "n29").replace("30", "n30")
                .replace("31", "n31").replace("32", "n22").replace("33", "n33").replace("34", "n34").replace("35", "n35").replace("36", "n36").replace("37", "n37").replace("38", "n38").replace("39", "n39").replace("40", "n40")
                .replace("41", "n41").replace("42", "n42").replace("43", "n43").replace("44", "n44").replace("45", "n45").replace("46", "n46").replace("47", "n47").replace("48", "n48").replace("49", "n49").replace("50", "n50")

                .replace("০", "nb0")
                .replace("১", "nb1").replace("২", "nb2").replace("৩", "nb3").replace("৪", "nb4").replace("৫", "nb5").replace("৬", "nb6").replace("৭", "nb7").replace("৮", "nb8").replace("৯", "nb9").replace("১০", "nb10")
                .replace("১১", "nb11").replace("১২", "nb12").replace("১৩", "nb13").replace("১৪", "nb14").replace("১৫", "nb15").replace("১৬", "nb16").replace("১৭", "nb17").replace("১৮", "nb18").replace("১৯", "nb19").replace("২০", "nb20")
                .replace("২১", "nb21").replace("২২", "nb22").replace("২৩", "nb23").replace("২৪", "nb24").replace("২৫", "nb25").replace("২৬", "nb26").replace("২৭", "nb27").replace("২৮", "nb28").replace("২৯", "nb29").replace("৩০", "nb30")
                .replace("৩১", "nb31").replace("৩২", "nb22").replace("৩৩", "nb33").replace("৩৪", "nb34").replace("৩৫", "nb35").replace("৩৬", "nb36").replace("৩৭", "nb37").replace("৩৮", "nb38").replace("৩৯", "nb39").replace("৪০", "nb40")
                .replace("৪১", "nb41").replace("৪২", "nb42").replace("৪৩", "nb43").replace("৪৪", "nb44").replace("৪৪", "nb45").replace("৪৬", "nb46").replace("৪৭", "nb47").replace("৪৮", "nb48").replace("৪৯", "nb49").replace("৫০", "nb50")
                ;


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
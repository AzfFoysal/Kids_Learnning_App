package com.example.kids_learning_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    String tabTitle[] = {"Alphabets","Details","Credits"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tl = findViewById(R.id.tabLayout);
        ViewPager2 pager = findViewById(R.id.viewPager2);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(new MyAdapter(getSupportFragmentManager(), getLifecycle()));

        TabLayoutMediator tm = new TabLayoutMediator(tl, pager, true,
                (tab, position) -> tab.setText(tabTitle[position]));
        tm.attach();
    }
}
package com.example.kids_learning_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {
    public MyAdapter(FragmentManager fragmentManager,Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new AlphabetFragment();
            case 1:
                return new BanglaAlphaFragment();
            case 2:
                return new DetailsFragment();
        }

        return new AlphabetFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

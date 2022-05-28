package com.example.adotapet.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.adotapet.fragments.Passo1Fragments;
import com.example.adotapet.fragments.Passo2Fragments;
import com.example.adotapet.fragments.Passo3Fragments;

public class MyViewAdapter extends FragmentStateAdapter {

    public MyViewAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new Passo1Fragments();
            case 1: return new Passo2Fragments();
            case 2: return new Passo3Fragments();
            default: return new Passo1Fragments();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

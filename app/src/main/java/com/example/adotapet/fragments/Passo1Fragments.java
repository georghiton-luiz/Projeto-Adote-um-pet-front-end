package com.example.adotapet.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.adotapet.R;
import com.example.adotapet.databinding.FragmentPasso1FragmentsBinding;


public class Passo1Fragments extends Fragment {

    private FragmentPasso1FragmentsBinding fragmentPasso1FragmentsBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentPasso1FragmentsBinding = FragmentPasso1FragmentsBinding.inflate(inflater, container, false);

        fragmentPasso1FragmentsBinding.avancarPasso1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = new Passo2Fragments();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container_view_tag_edit, fragment).commit();

            }
        });

        return fragmentPasso1FragmentsBinding.getRoot();
    }
}
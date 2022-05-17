package com.example.adotapet.fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.example.adotapet.CadPessoaFisica;
import com.example.adotapet.MyViewAdapter;
import com.example.adotapet.R;
import com.google.android.material.tabs.TabLayout;

public class Passo2Fragments extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_passo2_fragments, container, false);

//        Button btnFrag2Anterior = (Button) view.findViewById(R.id.btn_frag2_anterior);
//
//        btnFrag2Anterior.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragment_container_view_tag, new Passo1Fragments()).commit();
//            }
//        });
//
//        Button btnFrag2Avancar = (Button) view.findViewById(R.id.btn_frag2_avancar);
//        btnFrag2Avancar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragment_container_view_tag, new Passo3Fragments()).commit();
//            }
//        });

        //return inflater.inflate(R.layout.fragment_passo2_fragments, container, false); //--Antiga chamada de fragmento
        return view;
    }
}

package com.example.adotapet.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adotapet.R;
import com.example.adotapet.TelaPrincipalUsuario;
import com.example.adotapet.databinding.FragmentPerfilPetBinding;

public class PerfilPetFragment extends Fragment {


    private FragmentPerfilPetBinding perfilPetFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        TelaPrincipalUsuario teste = new TelaPrincipalUsuario();

        perfilPetFragment = FragmentPerfilPetBinding.inflate(inflater, container, false);

        perfilPetFragment.petOng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new OngFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, fragment).commit();
            }
        });

        return perfilPetFragment.getRoot();
    }
}
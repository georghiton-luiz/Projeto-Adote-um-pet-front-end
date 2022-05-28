package com.example.adotapet.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adotapet.MainActivity;
import com.example.adotapet.R;
import com.example.adotapet.TelaPrincipalUsuario;

public class LogoutFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_logout, container, false);

        Intent itTelaLogin = new Intent(getContext(), MainActivity.class);
        startActivity(itTelaLogin);

        MainActivity.userVisitante = false;

        return view;
    }
}
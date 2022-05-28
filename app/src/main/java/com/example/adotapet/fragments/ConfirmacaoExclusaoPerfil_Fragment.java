package com.example.adotapet.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.adotapet.R;

public class ConfirmacaoExclusaoPerfil_Fragment extends Fragment {

    Button btnConfirmExcluirPerfil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_confirmacao_exclusao_perfil_, container, false);

       btnConfirmExcluirPerfil = view.findViewById(R.id.btn_confirm_excluir_perfil);

       btnConfirmExcluirPerfil.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               getActivity().finish();

           }
       });

       return view;
    }
}
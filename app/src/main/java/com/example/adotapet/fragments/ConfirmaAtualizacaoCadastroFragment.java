package com.example.adotapet.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.adotapet.R;

public class ConfirmaAtualizacaoCadastroFragment extends Fragment {

    Button btnConcluirAtualizacaoCadastro;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_confirma_atualizacao_cadastro, container, false);

        btnConcluirAtualizacaoCadastro = view.findViewById(R.id.btn_concluir_confirme_atualizacao);

        btnConcluirAtualizacaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }
}
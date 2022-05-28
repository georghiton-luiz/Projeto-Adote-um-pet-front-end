package com.example.adotapet.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adotapet.R;

public class Passo3Fragments extends Fragment {

    EditText etUsername;
    EditText etSenhaEdit;
    EditText etConfimeSenhaEdit;
    String username;
    TextView tvCadPerfil;
    TextView tvUpdateCadPerfil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_passo3_fragments, container, false);
        Button ibtnAvatar = (Button) v.findViewById(R.id.btn_carregar_imagem);

        ibtnAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Intent.ACTION_PICK);
                it.setType("image/*");
                startActivityForResult(it, 0);
            }
        });

        etUsername = v.findViewById(R.id.et_username);
        etSenhaEdit = v.findViewById(R.id.et_senha_edit);
        etConfimeSenhaEdit = v.findViewById(R.id.et_confirme_senha_edit);
        tvCadPerfil = v.findViewById(R.id.tv_confirmacao_cadastro);
        tvUpdateCadPerfil = v.findViewById(R.id.tv_confirmacao_atualizacao);


            Button btnAvancar = v.findViewById(R.id.btn_avancar);

            btnAvancar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }

            });
        return  v;
    }
}
package com.example.adotapet.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.adotapet.ConfirmacaoAtualizacao;
import com.example.adotapet.ConfirmacaoDeCadastro;
import com.example.adotapet.R;

public class Passo3Fragments extends Fragment {

//    EditText etNomeCompleto;
//    EditText etCPF;
    EditText etUsername;
    EditText etSenhaEdit;
    EditText etConfimeSenhaEdit;
    String username;
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

//        etNomeCompleto = v.findViewById(R.id.et_nome_completo);
//        etCPF = v.findViewById(R.id.et_CPF);
        etUsername = v.findViewById(R.id.et_username);
        etSenhaEdit = v.findViewById(R.id.et_senha_edit);
        etConfimeSenhaEdit = v.findViewById(R.id.et_confirme_senha_edit);

            Button btnAvancar = v.findViewById(R.id.btn_avancar);

            btnAvancar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    username = etUsername.getText().toString();
                    if (username.equals("")){
                        AlertDialog.Builder msg = new AlertDialog.Builder(getActivity());
                        msg.setMessage("Preencha todos os campos obrigatorio");
                        msg.setNeutralButton("Ok", null);
                        msg.show();

                    }else {

                    Intent itConfirmacaoCadastro = new Intent(getActivity(), ConfirmacaoDeCadastro.class);
                    startActivity(itConfirmacaoCadastro);
                    getActivity().finish();
                }
            }
        });

        return  v;
    }
}
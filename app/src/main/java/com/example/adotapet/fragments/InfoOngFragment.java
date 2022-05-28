package com.example.adotapet.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.adotapet.R;
import com.example.adotapet.TelaPrincipalUsuario;

public class InfoOngFragment extends Fragment {

    private Button btnVoltar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info_ong, container, false);

        btnVoltar = getActivity().findViewById(R.id.btn_anterior_tela_principal);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent itTelaPrincipalUsuario = new Intent(getContext(), TelaPrincipalUsuario.class);
                startActivity(itTelaPrincipalUsuario);
            }
        });

        return view;
    }
}
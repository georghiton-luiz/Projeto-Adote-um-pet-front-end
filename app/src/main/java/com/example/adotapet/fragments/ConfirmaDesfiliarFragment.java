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
import com.example.adotapet.databinding.FragmentConfirmaDesfiliarBinding;

public class ConfirmaDesfiliarFragment extends Fragment {

    private FragmentConfirmaDesfiliarBinding fragmentConfirmaDesfiliarBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentConfirmaDesfiliarBinding = FragmentConfirmaDesfiliarBinding.inflate(inflater,container, false);


        fragmentConfirmaDesfiliarBinding.btnConfirmDefiliar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent itTelaPrincipalUsuario = new Intent(getContext(), TelaPrincipalUsuario.class);
                startActivity(itTelaPrincipalUsuario);

            }
        });

        return fragmentConfirmaDesfiliarBinding.getRoot();
    }
}
package com.example.adotapet.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.adotapet.R;
import com.example.adotapet.TelaPrincipalUsuario;

public class OngFragment extends Fragment {

    private Button btnVoltar;
    private Button btnSobreOng;
    private Button btnDefiliar;
    private FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ong, container, false);

        btnVoltar = getActivity().findViewById(R.id.btn_anterior_tela_principal);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Fragment fragment = new MinhasOngsFragment();
//                fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.nav_host_fragment, fragment);
//                fragmentTransaction.commit();
                Intent itTelaPrincipalUsuario = new Intent(getContext(), TelaPrincipalUsuario.class);
                startActivity(itTelaPrincipalUsuario);
            }
        });

        btnSobreOng = view.findViewById(R.id.sobre_ong);

        btnSobreOng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = new InfoOngFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, fragment).commit();
            }
        });

        btnDefiliar = view.findViewById(R.id.btn_desfiliar);

        btnDefiliar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = new DesfiliaseFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, fragment).commit();

            }
        });

        return view;
    }
}
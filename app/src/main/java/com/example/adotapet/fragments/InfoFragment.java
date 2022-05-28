package com.example.adotapet.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.adotapet.CadPessoaFisica;
import com.example.adotapet.MainActivity;
import com.example.adotapet.R;
import com.example.adotapet.TelaPrincipalUsuario;
import com.example.adotapet.databinding.ActivityTelaPrincipalUsuarioBinding;
import com.example.adotapet.databinding.FragmentInfoBinding;

public class InfoFragment extends Fragment {

    private Button btnVoltar;
    private FragmentTransaction fragmentTransaction;
    private View view;
    private boolean visitante = false;
    private FragmentInfoBinding fragmentInfoBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        fragmentInfoBinding = FragmentInfoBinding.inflate(inflater, container, false);

       if (MainActivity.userVisitante){
           Intent itCadPessoa = new Intent(getContext(), CadPessoaFisica.class);
           startActivity(itCadPessoa);
           return null;
       }

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
        return fragmentInfoBinding.getRoot();
    }

}
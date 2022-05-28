package com.example.adotapet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adotapet.databinding.ActivityMainBinding;
import com.example.adotapet.fragments.Passo2Fragments;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    public static boolean userVisitante = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
    }

    public void telaTipoDeCadastro(View v){

        Intent itTelaTipoDeCadastro = new Intent(this, PessoaFisicaJuridica.class);
        startActivity(itTelaTipoDeCadastro);
    }

    public void telaEsqueceuSenha(View v){

        Intent itEsqueceuSenha = new Intent(this, RecuperarSenha.class);
        startActivity(itEsqueceuSenha);
    }

    public void btnLogar(View v){
        
        String login = activityMainBinding.etLogin.getText().toString();
        String senha = activityMainBinding.etSenha.getText().toString();

        Intent itTelaPrincipalUsuario = new Intent(this, TelaPrincipalUsuario.class);
        startActivity(itTelaPrincipalUsuario);

//        if (login.equals("george") && senha.equals("1234")){
//            Intent itTelaPrincipalUsuario = new Intent(this, TelaPrincipalUsuario.class);
//            startActivity(itTelaPrincipalUsuario);
//        }else{
//            etLogin.setText("");
//            etSenha.setText("");
//            etLogin.requestFocus();
//            AlertDialog.Builder msg = new AlertDialog.Builder(this);
//            msg.setMessage("Username e/ou senha invalidas ou não cadastradas");
//            msg.setNeutralButton("Ok", null);
//            msg.show();
//
//        }
    }

    public void itLoginVisitante(View v){

        userVisitante = true;

        Intent itVisitante = new Intent(this, TelaPrincipalUsuario.class);
        startActivity(itVisitante);
    }
}
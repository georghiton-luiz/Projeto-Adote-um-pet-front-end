package com.example.adotapet;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

public class RecuperarSenha extends AppCompatActivity {

    EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_senha);
    }

    public void confirmaRecuperacaoSenha(View v){
        etEmail = findViewById(R.id.ed_email);

        if (etEmail.getText().toString().equals("geohiko@gmail.com")) {
            Intent itConfigRecupSenha = new Intent(this, ConfirmarRecuperacaoSenha.class);
            startActivity(itConfigRecupSenha);

        }else {
            AlertDialog.Builder msg = new AlertDialog.Builder(this);
            msg.setMessage("E-mail inválido ou não cadastrado");
            msg.setNeutralButton("Ok", null);
            msg.show();
        }
    }

    public void voltar(View v){
        this.finish();
    }

}

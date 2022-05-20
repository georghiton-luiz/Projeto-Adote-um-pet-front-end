package com.example.adotapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ConfirmarRecuperacaoSenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_recuperacao_senha);
    }

    public void telaLogin(View v){

        Intent itLogin = new Intent(this, MainActivity.class);
        startActivity(itLogin);

        this.finish();
    }

}
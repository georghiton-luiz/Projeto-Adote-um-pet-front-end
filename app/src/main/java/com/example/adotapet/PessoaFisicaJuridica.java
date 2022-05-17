package com.example.adotapet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class PessoaFisicaJuridica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_pessoa_fisica_juridica);
    }

    public void TelaCadPessoaFisica(View v){

        Intent itTelaCadPessoaFisica = new Intent(this, CadPessoaFisica.class);
        startActivity(itTelaCadPessoaFisica);
        this.finish();
    }


    public void voltar(View v){
        this.finish();
    }
}
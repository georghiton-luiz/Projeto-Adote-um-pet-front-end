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

import com.example.adotapet.fragments.Passo2Fragments;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText etLogin;
    EditText etSenha;
    TextView txtSenhaInvalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
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

        etLogin = findViewById(R.id.et_login);
        etSenha = findViewById(R.id.et_senha);
        txtSenhaInvalida = findViewById(R.id.txt_senha_invalida);
        String login = etLogin.getText().toString();
        String senha = etSenha.getText().toString();

        if (login.equals("george") && senha.equals("1234")){
            Intent itTelaPrincipalUsuario = new Intent(this, TelaPrincipalUsuario.class);
            startActivity(itTelaPrincipalUsuario);
        }else{
            etLogin.setText("");
            etSenha.setText("");
            etLogin.requestFocus();
            AlertDialog.Builder msg = new AlertDialog.Builder(this);
            msg.setMessage("Username e/ou senha invalidas ou não cadastradas");
            msg.setNeutralButton("Ok", null);
            msg.show();

        }
    }

    public void TelaEditar(View v){

        Intent itTelaEditarCadPessoaFisica = new Intent(this, EditPessoaFisica.class);
        startActivity(itTelaEditarCadPessoaFisica);
    }
}
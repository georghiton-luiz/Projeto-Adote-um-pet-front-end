package com.example.adotapet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.adotapet.adapter.MyViewAdapter;
import com.google.android.material.tabs.TabLayout;

public class CadPessoaFisica extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private TabLayout tabLayoutAdd ;
    private ViewPager2 viewPager2Add;
    private MyViewAdapter myViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_pessoa_fisica);

        tabLayoutAdd = findViewById(R.id.tab_layout_cad_perfil);
        viewPager2Add = findViewById(R.id.view_pager);
        FragmentManager manager = getSupportFragmentManager();
        myViewAdapter = new MyViewAdapter(manager, getLifecycle());
        viewPager2Add.setAdapter(myViewAdapter);

        tabLayoutAdd.addOnTabSelectedListener(this);

        viewPager2Add.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayoutAdd.selectTab(tabLayoutAdd.getTabAt(position));
            }
        });

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        viewPager2Add.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    public void voltarCad(View v){

        if (MainActivity.userVisitante){
            Intent itCadPessoa = new Intent(this, TelaPrincipalUsuario.class);
            startActivity(itCadPessoa);
        }else {
            Intent itLogin = new Intent(this, PessoaFisicaJuridica.class);
            startActivity(itLogin);
        }
        this.finish();
    }
}
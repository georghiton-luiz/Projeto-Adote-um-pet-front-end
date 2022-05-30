package com.example.adotapet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.adotapet.databinding.ActivityTelaPrincipalUsuarioBinding;

public class TelaPrincipalUsuario extends AppCompatActivity {

    private ActivityTelaPrincipalUsuarioBinding binding;

    private NavHostFragment navHostFragment, navHostFragment2;
    private NavController navController;
    private NavController navControllerTelaPrincipal;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTelaPrincipalUsuarioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DrawerLayout drawerLayout = findViewById(R.id.drawer_view);
        findViewById(R.id.menu_perfil).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        initNavigation();
        initMenuDeslizante();
    }

    public void initNavigation(){

        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);

    }

    private void initMenuDeslizante(){

        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navControllerTelaPrincipal =  navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.naviView, navControllerTelaPrincipal);
    }
}
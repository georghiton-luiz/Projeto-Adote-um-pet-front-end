package com.example.adotapet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.tabs.TabLayout;

public class EditPessoaFisica extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private TabLayout tabLayoutEdit;
    private ViewPager2 viewPager2Edit;
    private MyViewAdapter myViewAdapterEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_edit_pessoa_fisica);

        tabLayoutEdit = findViewById(R.id.tab_layout_edit);
        viewPager2Edit = findViewById(R.id.view_pager);
        FragmentManager manager = getSupportFragmentManager();
        myViewAdapterEdit = new MyViewAdapter(manager, getLifecycle());
        viewPager2Edit.setAdapter(myViewAdapterEdit);

        tabLayoutEdit.addOnTabSelectedListener(this);

        viewPager2Edit.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayoutEdit.selectTab(tabLayoutEdit.getTabAt(position));
            }
        });

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        viewPager2Edit.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    public void voltarEdit(View v){
        this.finish();
    }
}
package com.example.adotapet.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adotapet.adapter.MyViewAdapter;
import com.example.adotapet.R;
import com.google.android.material.tabs.TabLayout;

public class EditarPerfilFragment extends Fragment implements TabLayout.OnTabSelectedListener{

    private TabLayout tabLayoutEdit;
    private ViewPager2 viewPager2Edit;
    private MyViewAdapter myViewAdapterEdit;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_editar_perfil, container, false);

        tabLayoutEdit = v.findViewById(R.id.tb_edit_perfil);
        viewPager2Edit = v.findViewById(R.id.view_pager_edit);
        FragmentManager manager = getActivity().getSupportFragmentManager();

        myViewAdapterEdit = new MyViewAdapter(manager, getLifecycle());
        viewPager2Edit.setAdapter(myViewAdapterEdit);

        tabLayoutEdit.addOnTabSelectedListener(this);

        viewPager2Edit.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                tabLayoutEdit.selectTab(tabLayoutEdit.getTabAt(position));
            }
        });
        return v;
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
}
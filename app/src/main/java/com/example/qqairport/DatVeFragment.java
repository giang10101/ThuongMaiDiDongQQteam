package com.example.qqairport;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;


import com.example.qqairport.Adapter.SectionPagerAdapter;
import com.google.android.material.tabs.TabLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class DatVeFragment extends Fragment {
    View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;
    Button btnTimVeMotChieu,btnTimVeHaiChieu;


    public DatVeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment=inflater.inflate(R.layout.fragment_dat_ve,container,false);

        viewPager=myFragment.findViewById(R.id.viewPager);
        tabLayout=myFragment.findViewById(R.id.tabLayout);

        return myFragment;
    }@Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter=new SectionPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new MotChieuFragment(),"Một chiều");
        adapter.addFragment(new KhuHoiFragment(),"Khứ hồi");

        viewPager.setAdapter(adapter);


    }


}
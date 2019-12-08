package com.example.qqairport;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabHost;


/**
 * A simple {@link Fragment} subclass.
 */
public class DatXeFragment extends Fragment {
    TabHost tabHost;


    public DatXeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_dat_xe, container, false);


        Button button =v.findViewById(R.id.btnxe4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),DangNhapActivity.class);
                startActivity(i);
            }
        });

        tabHost= v.findViewById(R.id.tabhost);
        tabHost.setup();
        TabHost.TabSpec tab1=tabHost.newTabSpec("t1");
        tab1.setContent(R.id.tab1);
        tab1.setIndicator("Xe 4 chỗ ngồi");
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2=tabHost.newTabSpec("t2");
        tab2.setContent(R.id.tab2);
        tab2.setIndicator("Xe 7 chỗ ngồi");
        tabHost.addTab(tab2);

        return v;
    }

}

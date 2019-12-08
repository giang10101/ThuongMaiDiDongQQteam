package com.example.qqairport;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TabHost;


/**
 * A simple {@link Fragment} subclass.
 */
public class KhamPhaFragment extends Fragment {




    public KhamPhaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_kham_pha, container, false);


        String [] values =
                {"Tầng 1",
                        "Tầng 2",
                        "Tầng 3"};
        Spinner spin = (Spinner) v.findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spin.setAdapter(adapter);


        ImageView imgChonNhaHang=v.findViewById(R.id.imgNhaHang1);
        imgChonNhaHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),ThongTinNhaHangActivity.class);
                startActivity(i);
            }
        });

        TabHost tabHost = v.findViewById(R.id.tabhost);
        tabHost.setup();
        TabHost.TabSpec tab1=tabHost.newTabSpec("t1");
        tab1.setContent(R.id.tab1);
        tab1.setIndicator("Dine");
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2=tabHost.newTabSpec("t2");
        tab2.setContent(R.id.tab2);
        tab2.setIndicator("Shop");
        tabHost.addTab(tab2);

        return v;
    }


}

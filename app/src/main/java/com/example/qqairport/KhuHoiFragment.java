package com.example.qqairport;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class KhuHoiFragment extends Fragment {
    private LinearLayout llLayout;


    public KhuHoiFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_khu_hoi, container, false);


        String[] string={"Ha Noi (HAN)","Ho Chi Minh (SGN)","Phu Quoc (PQC)"};
        String[] songuoi={"01","02","03"};
        Spinner spinKhoiHanhMotChieu = v.findViewById(R.id.khoiHanhKhuHoi);
        Spinner spinDiemDenMotChieu = v.findViewById(R.id.diemDenKhuHoi);
        Spinner nguoiLon=v.findViewById(R.id.nguoiLonKhuHoi);
        Spinner treEm=v.findViewById(R.id.treEmKhuHoi);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, string);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        ArrayAdapter<String> adapternguoi = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, songuoi);
        adapternguoi.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinKhoiHanhMotChieu.setAdapter(adapter);
        spinDiemDenMotChieu.setAdapter(adapter);
        nguoiLon.setAdapter(adapternguoi);
        treEm.setAdapter(adapternguoi);


        Button btnTimVeKhuHoi=v.findViewById(R.id.btnTimVeKhuHoi);
        btnTimVeKhuHoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DanhSachKhuHoi.class);
                startActivity(intent);

            }
        });

        return v;
    }

}

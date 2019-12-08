package com.example.qqairport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;

public class DineAndShopActivity extends AppCompatActivity {
    ImageView imgChonNhaHang;
    TabHost tabHost;
    String arr[]={
            "Tầng 1",
            "Tầng 2",
            "Tầng 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_and_shop);
        addControl();
        addEvent();
        Spinner spin=(Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arr
                );
        adapter.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spin.setAdapter(adapter);
    }
    private void addEvent() {
        imgChonNhaHang=findViewById(R.id.imgNhaHang1);
        imgChonNhaHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chonNhaHang();
            }
        });
    }
    private void chonNhaHang() {
        Intent i=new Intent(DineAndShopActivity.this,ThongTinNhaHangActivity.class);
        startActivity(i);
    }
    private void addControl() {
        tabHost = this.<TabHost>findViewById(R.id.tabhost);
        tabHost.setup();
        TabHost.TabSpec tab1=tabHost.newTabSpec("t1");
        tab1.setContent(R.id.tab1);
        tab1.setIndicator("Dine");
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2=tabHost.newTabSpec("t2");
        tab2.setContent(R.id.tab2);
        tab2.setIndicator("Shop");
        tabHost.addTab(tab2);
    }

}

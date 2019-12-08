package com.example.qqairport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class XacNhanDatVeThanhCong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xac_nhan_dat_ve_thanh_cong);
    }

    public void VeTrangChu(View view) {
        Intent i=new Intent(XacNhanDatVeThanhCong.this,MainActivity.class);
        startActivity(i);
    }
}

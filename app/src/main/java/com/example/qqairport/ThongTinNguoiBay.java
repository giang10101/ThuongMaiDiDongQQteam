package com.example.qqairport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThongTinNguoiBay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_nguoi_bay);
    }

    public void chuyenTrangDangNhap(View view) {
        Intent i=new Intent(ThongTinNguoiBay.this,DangNhapActivity.class);
        startActivity(i);
    }
}

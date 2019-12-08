package com.example.qqairport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GioHangActivity extends AppCompatActivity {
    Button btnThanhToan, btnMuaTiep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);

    }

    public void xuLyThanhToan(View view) {
        Intent i=new Intent(GioHangActivity.this,DangNhapActivity.class);
        startActivity(i);
    }
}

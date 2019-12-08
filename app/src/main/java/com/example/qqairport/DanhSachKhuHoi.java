package com.example.qqairport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DanhSachKhuHoi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_khu_hoi);
    }
    public void chuyenTrangThongTinNguoiBay(View view) {

                Intent i=new Intent(DanhSachKhuHoi.this,ThongTinNguoiBay.class);
                startActivity(i);
            }


}

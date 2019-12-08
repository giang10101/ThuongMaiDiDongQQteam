package com.example.qqairport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DanhSachMotChieu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_mot_chieu);
    }

    public void chuyenTrangThongTinNguoiBay(View view) {
        ImageView imageView=findViewById(R.id.imgMotChieu);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DanhSachMotChieu.this, ThongTinNguoiBay.class);
                startActivity(i);
            }
        });
    }
}

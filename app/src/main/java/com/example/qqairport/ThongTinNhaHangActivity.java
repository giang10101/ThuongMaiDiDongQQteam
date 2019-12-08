package com.example.qqairport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThongTinNhaHangActivity extends AppCompatActivity {
    TextView MoTa;
    TabHost tabHost;
    Button btnchon1;
    Button datmon;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_nha_hang);
        addControl();
        addEvent();
    }

    private void addEvent() {
        btnchon1=(Button) findViewById(R.id.btnChon);
        btnchon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyMua();
            }
        });
    }
    private void xuLyMua() {
        Toast.makeText(this,
                "Đã đưa vào giỏ hàng",
                Toast.LENGTH_SHORT).show();
    }
    private void addControl() {
        tabHost = this.<TabHost>findViewById(R.id.tabhost);
        tabHost.setup();
        TabHost.TabSpec tab1=tabHost.newTabSpec("t1");
        tab1.setContent(R.id.tab1);
        tab1.setIndicator("Thực đơn");
        tabHost.addTab(tab1);
        TabHost.TabSpec tab2=tabHost.newTabSpec("t2");
        tab2.setContent(R.id.tab2);
        tab2.setIndicator("Bản đồ");
        tabHost.addTab(tab2);
    }

    public void DatMon(View view) {
        datmon = this.<Button>findViewById(R.id.btnDatMon);
        datmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(ThongTinNhaHangActivity.this, GioHangActivity.class);
                startActivity(i);
            }
        });
    }
}

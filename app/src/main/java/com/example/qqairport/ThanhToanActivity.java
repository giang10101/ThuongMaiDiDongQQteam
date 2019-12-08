package com.example.qqairport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThanhToanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan);
    }
    public void ThemThe(View view) {
        TextView textView=findViewById(R.id.txtThemThe);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ThanhToanActivity.this,ThongTinTheActivity.class);
                startActivity(i);
            }
        });
    }
    public void ThanhToanSCB(View view) {
        TextView txtsacombank=findViewById(R.id.txtscb);
        txtsacombank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThanhToan();
            }
        });
    }

    private void ThanhToan() {
        Toast.makeText(this,"Đã thanh toán thành công",Toast.LENGTH_SHORT).show();
        finish();
    }

    public void MuaSam(View view) {
        Intent i=new Intent(ThanhToanActivity.this,MainActivity.class);
        startActivity(i);
    }

    public void DatXe(View view) {
        Intent i=new Intent(ThanhToanActivity.this,ChoTAiXeActivity.class);
        startActivity(i);
    }

    public void DatVe(View view) {
        Intent i=new Intent(ThanhToanActivity.this,XacNhanDatVeThanhCong.class);
        startActivity(i);
    }
}

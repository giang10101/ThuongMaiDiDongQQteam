package com.example.qqairport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ChoTAiXeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cho_tai_xe);
    }

    public void CamOnDatXe(View view) {
        ImageView imageView=findViewById(R.id.imgDiChuyen);
        Intent i=new Intent(ChoTAiXeActivity.this,CamOnDatXeActivity.class);
        startActivity(i);
    }

    public void HuyChuyen(View view) {
        Button button=findViewById(R.id.btnHuyChuyen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

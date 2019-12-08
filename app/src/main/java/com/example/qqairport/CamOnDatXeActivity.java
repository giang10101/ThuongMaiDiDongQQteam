package com.example.qqairport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CamOnDatXeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam_on_dat_xe);
    }

    public void CamOnXe(View view) {
        ImageView imageView=findViewById(R.id.imgCamOn);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CamOnDatXeActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}

package com.example.qqairport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CamOnCheckinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam_on_checkin);
    }

    public void QuayLaiMhc(View view) {
        ImageView imageView = findViewById(R.id.imgCheckin);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CamOnCheckinActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}

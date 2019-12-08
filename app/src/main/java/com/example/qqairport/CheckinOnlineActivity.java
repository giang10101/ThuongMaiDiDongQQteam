package com.example.qqairport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CheckinOnlineActivity extends AppCompatActivity {
Button btnCheckin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin_online);

    }

    public void Checkin(View view) {
        btnCheckin = this.<Button>findViewById(R.id.btnCheckin);
        btnCheckin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CheckinOnlineActivity.this,ChonGheActivity.class);
                startActivity(i);
            }
        });
    }
}

package com.example.qqairport;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThongTinTheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_the);
    }

    public void LuuThe(View view) {
        Button button=findViewById(R.id.btnLuuThe);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                luuThe();
            }
        });
    }

    private void luuThe() {
        Toast.makeText(this,
                "Đã lưu thẻ",
                Toast.LENGTH_SHORT).show();
        finish();
    }
}

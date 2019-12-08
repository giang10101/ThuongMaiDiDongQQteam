package com.example.qqairport;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class DangNhapActivity extends AppCompatActivity {
    TabHost tabHost;
    EditText edtUser, edtPassword;
    TextView txtQuen;
    Button btnDangNhap, btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        addControl();
    }

    private void addControl() {
        tabHost=findViewById(R.id.tabHost);
        tabHost.setup();
        //tạo đối tượng 1 tab, có id là t1
        TabHost.TabSpec tab1=tabHost.newTabSpec("t1");
        //thiết lập nội dung layout
        tab1.setContent(R.id.tab1);
        //thiết lập tiêu đề cho tab
        tab1.setIndicator("Đăng nhập");
        //đưa tab1 vào tabhost
        tabHost.addTab(tab1);

        //tạo đối tượng 1 tab, có id là t1
        TabHost.TabSpec tab2=tabHost.newTabSpec("t2");
        //thiết lập nội dung layout
        tab2.setContent(R.id.tab2);
        //thiết lập tiêu đề cho tab
        tab2.setIndicator("Đăng ký");
        //đưa tab1 vào tabhost
        tabHost.addTab(tab2);

        edtUser=findViewById(R.id.edtUser);
        edtPassword=findViewById(R.id.edtPassword);
        txtQuen=findViewById(R.id.txtQuen);
        btnDangNhap=findViewById(R.id.btnDangNhap);
    }

    public void chuyenTrangThanhToan(View view) {
        Intent i=new Intent(DangNhapActivity.this,ThanhToanActivity.class);
        startActivity(i);
    }

    public void DangKyThanhCong(View view) {
        AlertDialog.Builder b=new AlertDialog.Builder(DangNhapActivity.this);
        b.setTitle("Đăng ký thành công");
        b.setMessage("Chúc mừng bạn đã đăng ký thành công");
        b.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                finish();
            }});
        b.setNegativeButton("Đóng", new DialogInterface.OnClickListener() {
            @Override

            public void onClick(DialogInterface dialog, int which)

            {

                dialog.cancel();

            }

        });

        b.create().show();
    }

    public void xuLyQuenPass(View view) {
        Dialog dialog = new Dialog(DangNhapActivity.this);
        dialog.setContentView(R.layout.quen_tai_khoan);
        dialog.show();
    }

    public void GuiEmail(View view) {
        Toast.makeText(this,"Bạn check email nhé!",Toast.LENGTH_SHORT).show();
    }
}

package com.example.qqairport;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navigation;
    FrameLayout frameLayout;

//Fragments
    private DatVeFragment datVeFragment;
    private DatXeFragment datXeFragment;
    private CheckinFragment checkinFragment;
    private KhamPhaFragment khamPhaFragment;
    private CaNhanFragment caNhanFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigation = findViewById(R.id.bottomNavigationView);
        frameLayout=findViewById(R.id.FrameLayout);

        //Fragment initialization
        datVeFragment =new DatVeFragment();
        datXeFragment=new DatXeFragment();
        checkinFragment=new CheckinFragment();
        khamPhaFragment=new KhamPhaFragment();
        caNhanFragment=new CaNhanFragment();



        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //Switch to select which is chosen:

                switch (menuItem.getItemId()){
                    case R.id.navigation_Checkin:
                        //code to be executed when icon 1 is selected
                        InitializerFragment(checkinFragment);
                        return  true;

                    case R.id.navigation_DatXe:
                        //code to be executed when icon 1 is selected
                        InitializerFragment(datXeFragment);
                        return  true;

                    case R.id.navigation_DatVe:
                        //code to be executed when icon 1 is selected
                        InitializerFragment(datVeFragment);
                        return  true;

                    case R.id.navigation_KhamPha:
                        //code to be executed when icon 1 is selected
                        InitializerFragment(khamPhaFragment);
                        return  true;

                    case R.id.navigation_CaNhan:
                        //code to be executed when icon 1 is selected
                        InitializerFragment(caNhanFragment);
                        return  true;

                }
                return false;
            }
        });

        navigation.setSelectedItemId(R.id.navigation_DatVe);

    }


    private void InitializerFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.FrameLayout, fragment);
        fragmentTransaction.commit();


    }


}

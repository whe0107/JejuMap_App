package com.example.activitymove;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class floor_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent Iinfo = getIntent();
        int BN = Iinfo.getIntExtra("info", 0);
        if(BN == 5) setContentView(R.layout.floor_b1);
        else if(BN == 4) setContentView(R.layout.floor_1);
        else if(BN == 3) setContentView(R.layout.floor_2);
        else if(BN == 2) setContentView(R.layout.floor_3);
        else if(BN == 1) setContentView(R.layout.floor_4);
    }
}
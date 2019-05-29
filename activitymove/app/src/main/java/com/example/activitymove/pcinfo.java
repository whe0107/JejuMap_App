package com.example.activitymove;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class pcinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intentmap = getIntent();
        int PCN = intentmap.getIntExtra("PCI", 0);
        if(PCN == 1) setContentView(R.layout.pcinfo1);
        else if(PCN == 2) setContentView(R.layout.pcinfo2);
        else if(PCN == 3) setContentView(R.layout.pcinfo3);
        else if(PCN == 4) setContentView(R.layout.pcinfo4);
        else if(PCN == 5) setContentView(R.layout.pcinfo5);
        else if(PCN == 6) setContentView(R.layout.pcinfo6);
    }
}

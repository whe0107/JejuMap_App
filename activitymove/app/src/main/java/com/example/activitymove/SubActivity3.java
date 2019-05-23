package com.example.activitymove;

import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;

public class SubActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.w){
            Intent intent1 = new Intent(this,food_western.class);
            startActivity(intent1);
        }

    }
}
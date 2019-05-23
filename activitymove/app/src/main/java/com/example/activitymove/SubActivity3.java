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
        else if (view.getId() == R.id.c){
            Intent intent2 = new Intent(this,food_china.class);
            startActivity(intent2);
        }
        else if (view.getId() == R.id.k){
            Intent intent3 = new Intent(this,food_korea.class);
            startActivity(intent3);
        }
        else if (view.getId() == R.id.j){
            Intent intent4 = new Intent(this,food_japen.class);
            startActivity(intent4);
        }
        else if (view.getId() == R.id.f){
            Intent intent4 = new Intent(this,food_flour.class);
            startActivity(intent4);
        }
        else if (view.getId() == R.id.others){
            Intent intent4 = new Intent(this,food_others.class);
            startActivity(intent4);
        }

    }
}
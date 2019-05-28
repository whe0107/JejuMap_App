package com.example.activitymove;


import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
public class foodinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intentmap = getIntent();
        int FN= intentmap.getIntExtra("FoodI", 0);
        if(FN == 1){
            setContentView(R.layout.foodinfo_china1);
        }
        else if(FN == 2){
            setContentView(R.layout.foodinfo_japen1);
        }
        else if(FN == 3){
            setContentView(R.layout.foodinfo_japen2);
        }
        else if(FN == 4){
            setContentView(R.layout.foodinfo_western1);
        }
        else if(FN == 5){
            setContentView(R.layout.foodinfo_western2);
        }
    }
}

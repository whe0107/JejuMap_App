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
        if(FN == 1) setContentView(R.layout.foodinfo_china1);
        else if(FN == 2) setContentView(R.layout.foodinfo_japen1);
        else if(FN == 3) setContentView(R.layout.foodinfo_japen2);
        else if(FN == 4) setContentView(R.layout.foodinfo_western1);
        else if(FN == 5) setContentView(R.layout.foodinfo_western2);
        else if(FN == 6) setContentView(R.layout.foodinfo_korea1);
        else if(FN == 7) setContentView(R.layout.foodinfo_korea2);
        else if(FN == 8) setContentView(R.layout.foodinfo_korea3);
        else if(FN == 9) setContentView(R.layout.foodinfo_korea4);
        else if(FN == 10) setContentView(R.layout.foodinfo_korea5);
        else if(FN == 11) setContentView(R.layout.foodinfo_korea6);
        else if(FN == 12) setContentView(R.layout.foodinfo_korea7);
        else if(FN == 13) setContentView(R.layout.foodinfo_korea8);
        else if(FN == 14) setContentView(R.layout.foodinfo_flour1);
        else if(FN == 15) setContentView(R.layout.foodinfo_flour2);
        else if(FN == 16) setContentView(R.layout.foodinfo_others1);
        else if(FN == 17) setContentView(R.layout.foodinfo_others2);
        else if(FN == 18) setContentView(R.layout.foodinfo_others3);
    }
}

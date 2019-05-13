package com.example.activitymove;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity<btn_map> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMap = (Button) findViewById(R.id.btn_map);
        Button btnParking = (Button) findViewById(R.id.btn_parking);
        Button btnFood = (Button) findViewById(R.id.btn_food);
        Button btnPC = (Button) findViewById(R.id.btn_pc);


    }

    public void onClick(View view) {
        if (view.getId() == R.id.btn_map){
            Intent intent1 = new Intent(this,SubActivity.class);
            startActivity(intent1);
        }
        else if(view.getId()==R.id.btn_parking) {
            Intent intent2 = new Intent(this, SubActivity2.class);
            startActivity(intent2);
        }
       else if(view.getId()==R.id.btn_food) {
            Intent intent3 = new Intent(this, SubActivity3.class);
            startActivity(intent3);
       }
       else if(view.getId() == R.id.btn_pc){
                Intent intent4 = new Intent(this,SubActivity4.class);
                startActivity(intent4);
       }
        else if(view.getId() == R.id.btn_back){
            Intent intent_back1 = new Intent(this,SubActivity.class);
            startActivity(intent_back1);
            Intent intent_back2 = new Intent(this,SubActivity2.class);
            startActivity(intent_back2);
            Intent intent_back3 = new Intent(this,SubActivity3.class);
            startActivity(intent_back3);
            Intent intent_back4 = new Intent(this,SubActivity4.class);
            startActivity(intent_back4);

        }

    }
}


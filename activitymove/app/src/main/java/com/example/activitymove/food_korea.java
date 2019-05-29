package com.example.activitymove;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class food_korea extends  AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_korea);

        ListView listview;
        itemlist_adapter adapter;

        adapter = new itemlist_adapter();

        listview = (ListView) findViewById(R.id.food_korea);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.korea), "위드미트");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.korea), "봉구스 밥버거");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.korea), "상아탑 식당");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.korea), "콘킹 부대찌개");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.korea), "삐삐네 정식");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.korea), "학교종이 땡땡땡");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.korea), "맵수다");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.korea), "밥먹젠");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(food_korea.this, MapsActivity.class);
                    intent.putExtra("info", 3);
                    intent.putExtra("info2", 5);
                    startActivity(intent);
                }
                else if(position == 1){
                    Intent intent = new Intent(food_korea.this, MapsActivity.class);
                    intent.putExtra("info", 3);
                    intent.putExtra("info2", 6);
                    startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(food_korea.this, MapsActivity.class);
                    intent.putExtra("info", 3);
                    intent.putExtra("info2", 7);
                    startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(food_korea.this, MapsActivity.class);
                    intent.putExtra("info", 3);
                    intent.putExtra("info2", 8);
                    startActivity(intent);
                }
                else if(position == 4){
                    Intent intent = new Intent(food_korea.this, MapsActivity.class);
                    intent.putExtra("info", 3);
                    intent.putExtra("info2", 9);
                    startActivity(intent);
                }
                else if(position == 5){
                    Intent intent = new Intent(food_korea.this, MapsActivity.class);
                    intent.putExtra("info", 3);
                    intent.putExtra("info2", 10);
                    startActivity(intent);
                }
                else if(position == 6){
                    Intent intent = new Intent(food_korea.this, MapsActivity.class);
                    intent.putExtra("info", 3);
                    intent.putExtra("info2", 11);
                    startActivity(intent);
                }
                else if(position == 7){
                    Intent intent = new Intent(food_korea.this, MapsActivity.class);
                    intent.putExtra("info", 3);
                    intent.putExtra("info2", 12);
                    startActivity(intent);
                }
            }
        });
    }
}
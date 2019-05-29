package com.example.activitymove;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends  AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview;
        MainListAdapter adapter;

        adapter = new MainListAdapter();

        listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.map_location), "교내 지도");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.parking), "주차장 지도");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.foodlst), "음식점 리스트");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pc), "PC방 리스트");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    intent.putExtra("info",1);
                    intent.putExtra("info2",0);
                    startActivity(intent);
                }
                else if(position == 1) {
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    intent.putExtra("info",2);
                    intent.putExtra("info2",0);
                    startActivity(intent);
                }
                else if(position == 2) {
                    Intent intent = new Intent(MainActivity.this, FoodListAct.class);
                    startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(MainActivity.this, PCListAct.class);
                    startActivity(intent);
                }
            }
        });
    }
}


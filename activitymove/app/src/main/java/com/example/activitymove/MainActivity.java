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
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.parking_location), "주차장 지도");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "음식점 리스트");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "PC방 리스트");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                if(position == 0){

                    Intent intent1 = new Intent(MainActivity.this, MapsActivity.class);
                    intent1.putExtra("info",1);
                    startActivity(intent1);
                }
                else if(position == 1) {
                    Intent intent2 = new Intent(MainActivity.this, MapsActivity.class);
                    intent2.putExtra("info",2);
                    startActivity(intent2);
                }
                else if(position == 2) {
                    Intent intent3 = new Intent(MainActivity.this, SubActivity3.class);
                    startActivity(intent3);
                }
                else if(position == 3){
                    Intent intent4 = new Intent(MainActivity.this, SubActivity4.class);
                    startActivity(intent4);
                }

            }
        });
    }
}


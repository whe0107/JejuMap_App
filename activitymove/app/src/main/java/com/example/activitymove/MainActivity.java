package com.example.activitymove;

import android.annotation.SuppressLint;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;

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

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.map_location),"교내 지도");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.parking_location),"주차장 지도");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.map_location),"음식점 리스트");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.map_location),"PC방 리스트");
    }
}


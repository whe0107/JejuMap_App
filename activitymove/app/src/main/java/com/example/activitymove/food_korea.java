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

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "위드미트");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "봉구스 밥버거");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "상아탑 식당");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "콘킹 부대찌개");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "삐삐네 정식");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "학교종이 땡땡땡");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "맵수다");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "밥먹젠");
    }
    public void onClick(View view)
    {
        finish();
    }
}
package com.example.activitymove;


import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class food_others extends  AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_others);

        ListView listview;
        itemlist_adapter adapter;

        adapter = new itemlist_adapter();

        listview = (ListView) findViewById(R.id.food_others);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.others), "토니버거");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.others), "맘스터치");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.others), "도스마스");

    }
    public void onClick(View view)
    {
        finish();
    }
}
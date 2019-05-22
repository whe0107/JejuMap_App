package com.example.activitymove;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class food_western extends  AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_western);

        ListView listview;
        food_w_listadapter adapter;

        adapter = new food_w_listadapter();

        listview = (ListView) findViewById(R.id.food_western);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "nine");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "이왕돈까스");

    }
    public void onClick(View view)
    {
        finish();
    }
}


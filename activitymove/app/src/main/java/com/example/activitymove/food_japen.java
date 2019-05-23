package com.example.activitymove;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class food_japen extends  AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_japen);

        ListView listview;
        food_j_listadapter adapter;

        adapter = new food_j_listadapter();

        listview = (ListView) findViewById(R.id.food_japen);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.food), "아우라 텐동");

    }
    public void onClick(View view)
    {
        finish();
    }
}

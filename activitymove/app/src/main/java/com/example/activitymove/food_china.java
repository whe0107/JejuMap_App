package com.example.activitymove;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class food_china extends  AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_china);

        ListView listview;
        itemlist_adapter adapter;

        adapter = new itemlist_adapter();

        listview = (ListView) findViewById(R.id.food_china);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.china), "진성반점");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                if(position == 0){

                    Intent intent = new Intent(food_china.this, MapsActivity.class);
                    intent.putExtra("info", 3);
                    intent.putExtra("info2", 0);
                    startActivity(intent);
                }
            }
        });
    }
}

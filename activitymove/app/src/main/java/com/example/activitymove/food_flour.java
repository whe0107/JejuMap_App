package com.example.activitymove;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class food_flour extends  AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_flour);

        ListView listview;
        itemlist_adapter adapter;

        adapter = new itemlist_adapter();

        listview = (ListView) findViewById(R.id.food_flour);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flour), "신전 떡볶이");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flour), "김밥천국");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(food_flour.this, MapsActivity.class);
                    intent.putExtra("info", 3);
                    intent.putExtra("info2", 13);
                    startActivity(intent);
                }
                else if(position == 1){
                    Intent intent = new Intent(food_flour.this, MapsActivity.class);
                    intent.putExtra("info", 3);
                    intent.putExtra("info2", 14);
                    startActivity(intent);
                }
            }
        });
    }
}
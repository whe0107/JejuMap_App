package com.example.activitymove;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class buildinginfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buildinginfo);

        ListView listview;
        itemlist_adapter adapter;

        adapter = new itemlist_adapter();

        listview = (ListView) findViewById(R.id.building_listView);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "4층-컴퓨터공학");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "3층-에너지공학");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "2층-메카트로닉스공학");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "1층-기계공학");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "지하 1층-건축학");
    }
    public void onClick(View view)
    {
        finish();
    }
}

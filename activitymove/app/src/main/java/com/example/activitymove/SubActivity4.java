package com.example.activitymove;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class SubActivity4 extends  AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc);

        ListView listview;
        PCLISTAdapter adapter;

        adapter = new PCLISTAdapter();

        listview = (ListView) findViewById(R.id.PC_listView);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "제대PC방");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "아이비스PC방");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "탑클래스PC방");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "W PC방");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "샹떼 PC방");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "아이센스PC방");
    }
    public void onClick(View view)
    {
        finish();
    }
}

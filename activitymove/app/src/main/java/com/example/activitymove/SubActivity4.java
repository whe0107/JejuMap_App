package com.example.activitymove;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SubActivity4 extends  AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc);

        ListView listview;
        itemlist_adapter adapter;

        adapter = new itemlist_adapter();

        listview = (ListView) findViewById(R.id.PC_listView);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "제대 PC방");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "아이비스 PC방");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "탑클래스 PC방");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "W PC방");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "아이센스 PC방");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.computer), "샹떼 PC방");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                if(position == 0){

                    Intent intent1 = new Intent(SubActivity4.this, MapsActivity.class);
                    intent1.putExtra("info", 4);
                    intent1.putExtra("info2", 0);
                    startActivity(intent1);
                }
                else if(position == 1) {
                    Intent intent2 = new Intent(SubActivity4.this, MapsActivity.class);
                    intent2.putExtra("info", 4);
                    intent2.putExtra("info2", 1);
                    startActivity(intent2);
                }
                else if(position == 2) {
                    Intent intent3 = new Intent(SubActivity4.this, MapsActivity.class);
                    intent3.putExtra("info", 4);
                    intent3.putExtra("info2", 2);
                    startActivity(intent3);
                }
                else if(position == 3){
                    Intent intent4 = new Intent(SubActivity4.this, MapsActivity.class);
                    intent4.putExtra("info", 4);
                    intent4.putExtra("info2", 3);
                    startActivity(intent4);
                }
                else if(position == 4){
                    Intent intent5 = new Intent(SubActivity4.this, MapsActivity.class);
                    intent5.putExtra("info", 4);
                    intent5.putExtra("info2", 4);
                    startActivity(intent5);
                }
                else if(position == 5){
                    Intent intent6 = new Intent(SubActivity4.this, SubActivity4.class);
                    intent6.putExtra("info", 4);
                    intent6.putExtra("info2", 5);
                    startActivity(intent6);
                }

            }
        });
    }
}

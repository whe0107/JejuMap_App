package com.example.activitymove;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
    public void onClick(View view)
    {
        finish();
    }
}

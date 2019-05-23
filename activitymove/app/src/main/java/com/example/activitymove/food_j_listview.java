package com.example.activitymove;

import android.graphics.drawable.Drawable;

public class food_j_listview {
    private Drawable mIcon;
    private String mName;

    public void setIcon(Drawable icon){
        mIcon = icon;
    }

    public void setName(String name){
        mName = name;
    }
    public Drawable getmIcon(){
        return this.mIcon;
    }
    public String getmName(){
        return this.mName;
    }
}

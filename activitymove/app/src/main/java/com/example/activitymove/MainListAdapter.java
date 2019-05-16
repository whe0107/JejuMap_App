package com.example.activitymove;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainListAdapter extends BaseAdapter{
    private ArrayList<MainListviewAct> listviewItem = new ArrayList<MainListviewAct>();

    public MainListAdapter(){

    }
    @Override
    public int getCount(){
        return listviewItem.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.mainlist_layout, parent, false);
        }

        ImageView imgVeiw = (ImageView) convertView.findViewById(R.id.listImg);
        TextView nVeiw = (TextView) convertView.findViewById(R.id.listText);

        MainListviewAct itemlist = listviewItem.get(position);

        imgVeiw.setImageDrawable(itemlist.getmIcon());
        nVeiw.setText(itemlist.getmName());

        return convertView;
    }

    @Override
    public Object getItem(int position){
        return listviewItem.get(position);
    }
    @Override
    public long getItemId(int position){
        return position;
    }

    public void addItem(Drawable img, String name){
        MainListviewAct item = new MainListviewAct();
        item.setIcon(img);
        item.setName(name);
        listviewItem.add(item);
    }
}

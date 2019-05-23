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

public class food_o_listadapter extends BaseAdapter {
    private ArrayList<food_o_listview> listviewItem = new ArrayList<food_o_listview>();

    public food_o_listadapter() {

    }

    @Override
    public int getCount() {
        return listviewItem.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.food_o_layout, parent, false);
        }

        ImageView imgVeiw = (ImageView) convertView.findViewById(R.id.food_o_imageview);
        TextView nVeiw = (TextView) convertView.findViewById(R.id.food_o_textview);

        food_o_listview itemlist = listviewItem.get(position);

        imgVeiw.setImageDrawable(itemlist.getmIcon());
        nVeiw.setText(itemlist.getmName());

        return convertView;
    }

    @Override
    public Object getItem(int position) {
        return listviewItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addItem(Drawable img, String name) {
        food_o_listview item = new food_o_listview();
        item.setIcon(img);
        item.setName(name);
        listviewItem.add(item);
    }
}

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

public class itemlist_adapter extends BaseAdapter {
    private ArrayList<item_listview> listviewItem = new ArrayList<item_listview>();

    public itemlist_adapter() {

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
            convertView = inflater.inflate(R.layout.itemlist_layout, parent, false);
        }

        ImageView imgVeiw = (ImageView) convertView.findViewById(R.id.item_imageview);
        TextView nVeiw = (TextView) convertView.findViewById(R.id.item_textview);

        item_listview itemlist = listviewItem.get(position);

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
        item_listview item = new item_listview();
        item.setIcon(img);
        item.setName(name);
        listviewItem.add(item);
    }
}

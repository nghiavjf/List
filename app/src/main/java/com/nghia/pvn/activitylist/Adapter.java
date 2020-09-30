package com.nghia.pvn.activitylist;

import android.app.Activity;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.contentcapture.DataShareWriteAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
    private Activity activity;
    private String[] items;
    public Adapter(Activity activity,   String[] items)
    {
        this.activity=activity;
        this.items=items;
    }


    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=activity.getLayoutInflater();
        view=inflater.inflate(R.layout.item_name,null);
        TextView tvName= (TextView)view.findViewById(R.id.tv_name);
        tvName.setText(items[i]);
        return view;
    }

}

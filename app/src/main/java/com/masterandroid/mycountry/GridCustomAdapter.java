package com.masterandroid.mycountry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridCustomAdapter extends BaseAdapter {

    Context context;
    int[] icons;
    String[] districtOptions;
    private LayoutInflater inflater;

    GridCustomAdapter(Context context, int[] icons, String[] districtOptions){
        this.context=context;
        this.icons=icons;
        this.districtOptions=districtOptions;
    }

    @Override
    public int getCount() {
        return districtOptions.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_sample_view,parent,false);


        }

        TextView textView = convertView.findViewById(R.id.gridTextViewId);
        ImageView imageView = convertView.findViewById(R.id.gridImageViewId);

        textView.setText(districtOptions[position]);
        imageView.setImageResource(icons[position]);
        return convertView;
    }
}

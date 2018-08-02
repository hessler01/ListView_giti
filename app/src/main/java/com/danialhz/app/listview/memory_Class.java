package com.danialhz.app.listview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mashhadcom.com on 8/1/2018.
 */

public class memory_Class extends ArrayAdapter {
    public memory_Class(@NonNull Context context, @NonNull List names) {
        super(context, 0, names);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView==null){
            convertView= LayoutInflater.from(getContext())
                    .inflate(R.layout.activity_memory,parent,false);
        }
        String name= (String) getItem(position);
        TextView nametextview=convertView.findViewById(R.id.tv_name);
        nametextview.setText(name);

        ImageView images=convertView.findViewById(R.id.iv_sea);

        switch (position){
            case 0:
                images.setImageResource(R.drawable.sea_picture);
                break;
            case 1:
                images.setImageResource(R.drawable.holy_sherine_picture);
                break;
            case 2:
                images.setImageResource(R.drawable.driver_image);
                break;
            case 3:
                images.setImageResource(R.drawable.kavir2);
                break;
            case 4:
                images.setImageResource(R.drawable.mountain_image);
                break;
        }





        return convertView;
    }
}

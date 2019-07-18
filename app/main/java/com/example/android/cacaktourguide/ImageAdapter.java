package com.example.android.cacaktourguide;



import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


/**
 * Created by Katarina on 30.8.2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    Intent i;


    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(final int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5, 5, 5, 5);


        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);


        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.cacak, R.drawable.cacak2,
            R.drawable.cacak3, R.drawable.cacak4,
            R.drawable.cacak5, R.drawable.cacak6,
            R.drawable.cacak7, R.drawable.cacak8
    };



    }

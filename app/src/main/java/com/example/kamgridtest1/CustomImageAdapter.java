package com.example.kamgridtest1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class CustomImageAdapter extends BaseAdapter {
    private Context context;
    private int[] images;

    public CustomImageAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
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
        ImageView imageView;
        imageView = new ImageView(context);
        //imageView.setLayoutParams(new ViewGroup.LayoutParams(85, 85));
        imageView.setLayoutParams(new GridView.LayoutParams(325,325));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);

//        if (convertView == null) {
//            imageView = new ImageView(context);
//            imageView.setLayoutParams(new ViewGroup.LayoutParams(85, 85));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8, 8, 8, 8);
//        } else {
//            imageView = (ImageView) convertView;
//        }
        imageView.setImageResource(images[position]);
        return imageView;
    }
}
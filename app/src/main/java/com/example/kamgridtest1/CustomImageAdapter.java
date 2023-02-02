package com.example.kamgridtest1;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
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
    public View getView(int i, View view, ViewGroup parent) {
        if (view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.image_item, null);
        }
        ImageView imageView = view.findViewById(R.id.imageView);

        if (i % 2 == 0)
            imageView.setBackgroundColor(Color.BLACK);
        else
            imageView.setBackgroundColor(Color.WHITE);

        imageView.setImageResource(images[i]);
        return view;

    }
}
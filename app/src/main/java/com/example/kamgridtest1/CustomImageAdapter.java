package com.example.kamgridtest1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class CustomImageAdapter extends BaseAdapter {
    private Context context;
    private int[] images;

   // private Object findByViewId;
    //ImageView imageView = (ImageView) findByViewId(R.id.imageView);

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
//        imageView.setMaxHeight(25);
//        imageView.setMaxWidth(25);
        imageView.setImageResource(images[i]);
        return view;

//        ImageView imageView;
//        imageView = new ImageView(context);
//        imageView.setMaxWidth(10);
//        imageView.setMaxHeight(10);
//        imageView.
//
//        //imageView.setLayoutParams(new ViewGroup.LayoutParams(85, 85));
//        imageView.setLayoutParams(new GridView.LayoutParams(325,325));
//        //imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//        imageView.setPadding(8, 8, 8, 8);
//
////        if (convertView == null) {
////            imageView = new ImageView(context);
////            imageView.setLayoutParams(new ViewGroup.LayoutParams(85, 85));
////            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
////            imageView.setPadding(8, 8, 8, 8);
////        } else {
////            imageView = (ImageView) convertView;
////        }
//        imageView.setImageResource(images[position]);
//        return imageView;
    }
}
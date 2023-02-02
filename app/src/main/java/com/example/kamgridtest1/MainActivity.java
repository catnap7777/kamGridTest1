package com.example.kamgridtest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Integer[] celebrityPic = {
            R.drawable.apple2,
            R.drawable.cat,
            R.drawable.apple2,
            R.drawable.cat,
            R.drawable.apple2,
            R.drawable.cat,
            R.drawable.apple2,
            R.drawable.cat,
            R.drawable.apple2,
            R.drawable.cat,
    };



//    List<String> list = new ArrayList<String>(Arrays.asList(array));

    ConstraintLayout const1;
    ImageView pic;
    //ImageView pic2 = findViewById(R.id.imageView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        const1 = (ConstraintLayout) findViewById(R.id.constraintLayout1);
        const1.setBackgroundResource(R.drawable.cat);

        GridView grid1 = (GridView) findViewById(R.id.gridView1);

        //AI
        int[] images = {
                R.drawable.apple2,
                R.drawable.cat,
                R.drawable.clearnigiri,
                R.drawable.apple2,
                R.drawable.cat,
                R.drawable.clearnigiri,
                R.drawable.apple2,
                R.drawable.cat,
                R.drawable.clearnigiri,
                R.drawable.apple2,
                R.drawable.cat,
                R.drawable.clearnigiri,
                R.drawable.apple2,
                R.drawable.cat,
        };
        CustomImageAdapter imageAdapter3 = new CustomImageAdapter(this, images);
        grid1.setAdapter(imageAdapter3);

        //grid1.setAdapter(new ImageAdapter1(this));
        //grid1.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, list));
        //grid1.setAdapter(new ArrayAdapter<String>(this, R.layout.image_item, celebrityPic));

    }

    //.. adapter for grid1
//    public class ImageAdapter1 extends BaseAdapter {
//
//        private Context context;
//
//        public ImageAdapter1(Context c) {
//            context = c;
//        }
//
//        @Override
//        public int getCount() {
//            return celebrityPic.length;
//            //return 64;
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return null;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return 0;
//        }
//
//        // can probably do something like with list_item from regular adapter.  Just use image instead?
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//
////            pic2 = new ImageView(context);
////            pic2.setImageResource(celebrityPic[position]);
////            pic2.setScaleType(ImageView.ScaleType.FIT_XY);
////            //pic.setLayoutParams(new GridView.LayoutParams(215,265));
////            //pic.setLayoutParams(new GridView.LayoutParams(225,275));
////            pic2.setLayoutParams(new GridView.LayoutParams(150,150));
////            return pic2;
//
//
//            pic = new ImageView(context);
//            pic.setMaxHeight(10);
//            pic.setMaxWidth(10);
//            pic.setImageResource(celebrityPic[position]);
//            //pic.setScaleType(ImageView.ScaleType.FIT_XY);
//            //pic.setLayoutParams(new GridView.LayoutParams(215,265));
//            //pic.setLayoutParams(new GridView.LayoutParams(225,275));
//            //pic.setLayoutParams(new GridView.LayoutParams(325,325));
//            GridView grid2 = (GridView) findViewById(R.id.gridView1);
//            grid2.setColumnWidth(50);
//            grid2.setNumColumns(8);
//            grid2.setHorizontalSpacing(5);
//            grid2.setVerticalSpacing(5);
//            pic.setLayoutParams(grid2.getLayoutParams());
//
//
//            return pic;
//        }
//    }

}


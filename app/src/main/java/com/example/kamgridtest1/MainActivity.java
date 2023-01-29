package com.example.kamgridtest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout const1;
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //const1 = (ConstraintLayout) findViewById(R.id.root);
        //const1.setBackgroundResource(R.drawable.cat);

        //.. example from https://stackoverflow.com/questions/12047369/how-to-set-border-of-gridview-on-android
        //String[] array = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] array = new String[] {"", "", "", "", "", "", "", "",
                                        "", "", "", "", "", "", "", "",
                                        "", "", "", "", "", "", "", "",
                                        "", "", "", "", "", "", "", "",
                                        "", "", "", "", "", "", "", "",
                                        "", "", "", "", "", "", "", "",
                                        "", "", "", "", "", "", "", "",
                                        "", "", "", "", "", "", "", ""
                                        };
        List<String> list = new ArrayList<String>(Arrays.asList(array));

        GridView grid1 = (GridView) findViewById(R.id.gridview1);

        // ??? not sure I know what this does but I was attempting to make scrolling slower
        grid1.smoothScrollToPosition(0);
        grid1.setFriction(ViewConfiguration.getScrollFriction() * 55);

        //grid1.setAdapter(new ImageAdapter1(this));
        grid1.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, list));

//        grid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                Toast.makeText(getBaseContext(),"Selected: " + (position + 1),
//                        Toast.LENGTH_SHORT).show();
//
//                const1.setBackgroundColor(0xffAEBAC4);
//
//            }
//        });

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
////            return celebrityPic.length;
//            return 64;
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
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            pic = new ImageView(context);
//            //pic.setImageResource(celebrityPic[position]);
//            pic.setScaleType(ImageView.ScaleType.FIT_XY);
//            //pic.setLayoutParams(new GridView.LayoutParams(215,265));
//            //pic.setLayoutParams(new GridView.LayoutParams(225,275));
//            pic.setLayoutParams(new GridView.LayoutParams(300,350));
//            return pic;
//        }
//    }

}


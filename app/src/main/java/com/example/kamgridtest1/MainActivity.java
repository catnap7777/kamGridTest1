package com.example.kamgridtest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout const1;
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        const1 = (ConstraintLayout) findViewById(R.id.constraintLayout1);
        const1.setBackgroundResource(R.drawable.cat);

        GridView grid1 = (GridView) findViewById(R.id.gridView1);

        int[] images = {
                R.drawable.clearnigiri,
                R.drawable.clearnigiri,
                R.drawable.clearnigiri,
                R.drawable.clearnigiri,
                R.drawable.clearnigiri,
                R.drawable.clearnigiri,
                R.drawable.clearnigiri,
                R.drawable.clearnigiri,
                R.drawable.clearnigiri,
                R.drawable.clearnigiri,
                R.drawable.clearnigiri
        };


        CustomImageAdapter imageAdapter3 = new CustomImageAdapter(this, images);
        grid1.setAdapter(imageAdapter3);

    }


}


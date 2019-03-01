package com.headspire.galleryview;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * @version 1.0
 * @created 01.03.2019 by Ashish Yadav
 */
public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private DataAdapter dataAdapter;
    //images will load at before the class is loaded in the memory.
    private static int[] images;
    //to load the images prior to class loading.
    static {
        images= new int[]{
                R.drawable.large,
                R.drawable.water1,
                R.drawable.water3,
                R.drawable.water4,
                R.drawable.water5,
                R.drawable.water6
        };
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataAdapter=new DataAdapter(this,images);
        viewPager=findViewById(R.id.viewpager);
        viewPager.setAdapter(dataAdapter);
    }
}

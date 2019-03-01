package com.headspire.galleryview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DataAdapter extends PagerAdapter {
    //context holds the main activity context.
    private Context context;
    private LayoutInflater inflater;
    private int[] images;
    private ImageView imageView;
    public DataAdapter(Context context,int[] images)
    {
        this.context=context;
        this.images=images;
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemView=inflater.inflate(R.layout.view_item,container,false);
        imageView=itemView.findViewById(R.id.showimage);
        imageView.setImageResource(images[position]);
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}

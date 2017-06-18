package com.example.admin.tutorial9;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by admin on 2017-06-13.
 */

public class Adapter extends PagerAdapter {

    private int[] image = {R.drawable.one , R.drawable.two , R.drawable.three };
    private LayoutInflater inflater;
    private Context context;


    public Adapter(Context context)
    {
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (LinearLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //return super.instantiateItem(container, position);

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v =inflater.inflate(R.layout.slider, container,false);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        imageView.setImageResource(image[position]);
        textView.setText((position+1) + "번째 이미지입니다." );

        container.addView(v);
        return v;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //super.destroyItem(container, position, object);
        container.invalidate();
    }
}

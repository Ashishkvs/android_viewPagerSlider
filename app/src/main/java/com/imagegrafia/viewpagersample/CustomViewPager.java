package com.imagegrafia.viewpagersample;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Ashish on 3/10/2018.
 */

public class CustomViewPager extends PagerAdapter {

    private Context mContext;
    public CustomViewPager (Context context){
        mContext=context;
    }
    String []titles={"title1","title2","title3","title4"};
    String []descriptions={"desc1","desc2","desc23","desc24"};
   int images[]={R.drawable.coconut,R.drawable.coconut2,R.drawable.coconut3,R.drawable.coconut4};
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==(LinearLayout)object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view=layoutInflater.inflate(R.layout.view_pager_layout,container,false);

        ImageView imageView=view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        TextView title=view.findViewById(R.id.title);
        title.setText(titles[position].toString());
        TextView desc=view.findViewById(R.id.desc);
        desc.setText(descriptions[position].toString());
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}

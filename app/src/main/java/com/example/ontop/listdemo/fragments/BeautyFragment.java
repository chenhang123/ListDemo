package com.example.ontop.listdemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ontop.listdemo.R;
import com.example.ontop.listdemo.component.BeautyView;

import java.util.ArrayList;

/**
 * Created by Ontop on 2017/11/27.
 */

public class BeautyFragment extends Fragment {
    private ViewPager beautyPager;
    private ArrayList<View> viewList = new ArrayList<View>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beauty, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        beautyPager = (ViewPager) view.findViewById(R.id.viewpager_beauty);
        LayoutInflater inflater = getLayoutInflater(savedInstanceState);
        TextView tv1 = new TextView(getContext());
        tv1.setText("fukckkkdddddddd");
        ImageView img1 = new ImageView(getContext());
        img1.setImageResource(R.drawable.ic_menu_camera);
        BeautyView beautyView1 = new BeautyView(getContext());
        BeautyView beautyView2 = new BeautyView(getContext());
        BeautyView beautyView3 = new BeautyView(getContext());
       /* View view1 = inflater.inflate(R.layout.view_beauty,null);
        View view2 = inflater.inflate(R.layout.view_beauty,null);
        View view3 = inflater.inflate(R.layout.view_beauty,null);*/
        viewList.add(beautyView1);
        viewList.add(beautyView2);
        viewList.add(beautyView3);
        beautyPager.setAdapter(pagerAdapter);
    }

    PagerAdapter pagerAdapter = new PagerAdapter() {
        @Override
        public int getCount() {
            return viewList.size();
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == arg1;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(viewList.get(position));
            return viewList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(viewList.get(position));
        }
    };
}

package com.example.ontop.listdemo.component;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ontop.listdemo.R;

/**
 * Created by Ontop on 2017/11/28.
 */

public class BeautyView extends LinearLayout {
    private TextView beautyTv;
    private ImageView beautyImg;

    public BeautyView(Context context, TextView beautyTv, ImageView beautyImg) {
        super(context);
        this.beautyTv = beautyTv;
        this.beautyImg = beautyImg;
    }

    public BeautyView(Context context) {
        super(context);
        initView(context);
    }

    public BeautyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public BeautyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private View initView(Context context) {
        View view = View.inflate(context, R.layout.view_beauty, this);
        beautyImg = view.findViewById(R.id.img_beauty);
        beautyTv = view.findViewById(R.id.tv_beauty);
        return view;
    }


}

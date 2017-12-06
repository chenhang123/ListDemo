package com.example.ontop.listdemo.activitys;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ontop.listdemo.R;

/**
 * Created by Ontop on 2017/11/27.
 */

public class LoginActivity extends Activity implements View.OnClickListener {
    private ImageView backImg;
    private TextView titleTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        backImg = (ImageView) findViewById(R.id.img_back);
        backImg.setOnClickListener(this);
        titleTv = (TextView) findViewById(R.id.tv_title);
        titleTv.setText("登录");
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.img_back:
                finish();
                break;

        }

    }
}

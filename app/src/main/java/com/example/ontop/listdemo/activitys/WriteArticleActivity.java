package com.example.ontop.listdemo.activitys;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ontop.listdemo.R;

/**
 * Created by Ontop on 2017/11/27.
 */

public class WriteArticleActivity extends Activity implements View.OnClickListener {
    private TextView cancleTv;
    private TextView submitTv;
    private EditText titleTv;
    private EditText contentTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_article);
        initView();
    }

    private void initView() {
        cancleTv = (TextView) findViewById(R.id.tv_cancle);
        submitTv = (TextView) findViewById(R.id.tv_submit);
        cancleTv.setOnClickListener(this);
        submitTv.setOnClickListener(this);
        titleTv = (EditText) findViewById(R.id.edit_title);
        contentTv = (EditText) findViewById(R.id.edit_content);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_cancle:
                finish();
                break;
            case R.id.tv_submit:
                Toast.makeText(WriteArticleActivity.this, "发布成功", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

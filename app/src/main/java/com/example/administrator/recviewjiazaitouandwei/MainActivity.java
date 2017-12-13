package com.example.administrator.recviewjiazaitouandwei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //直接加载控件布局就好了这里没有加载布局
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        iamger_usre_layout.setLayoutManager(gridLayoutManager);
        AdapterUserImage adapterUserImage = new AdapterUserImage(listImage);
        mFooterView = LayoutInflater.from(this).inflate(R.layout.adapter_userimages, iamger_usre_layout, false);
        iamger_usre_layout.addFooterView(mFooterView);
        iamger_usre_layout.setAdapter(adapterUserImage);
        //添加头像
        mFooterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //每个头像
        adapterUserImage.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, Object data, int position) {

            }
        });
    }
}

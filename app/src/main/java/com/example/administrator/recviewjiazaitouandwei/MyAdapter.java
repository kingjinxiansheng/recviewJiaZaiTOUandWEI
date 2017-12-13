package com.example.administrator.recviewjiazaitouandwei;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by King on 2015/12/29.
 * 正常加载布局就好了
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    public List<String> mData;
    public MyAdapter(List<String> data){
        mData = data;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

//       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listview_item,parent,false);
//        return new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(View view){
            super(view);
//            mTextView = (TextView) view.findViewById(R.id.tv_content);
        }
    }
}

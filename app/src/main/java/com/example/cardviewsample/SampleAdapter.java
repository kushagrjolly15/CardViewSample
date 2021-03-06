package com.example.cardviewsample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.ViewHolder> {
    private LayoutInflater mLayoutInflater;
    private ArrayList<String> mDataList;

    public SampleAdapter(Context context, ArrayList<String> dataList) {
        super();
        mLayoutInflater = LayoutInflater.from(context);
        mDataList = dataList;
    }

    // getViewのinfrateするところだけ取り出した感じ
    @Override
    public SampleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mLayoutInflater.inflate(R.layout.adapter_sample, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String data = (String) mDataList.get(position);
        holder.text.setText(data);
    }

    // ViewHolder内でwidgetを割り当てる
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;

        public ViewHolder(View v) {
            super(v);
            text = (TextView) v.findViewById(R.id.text);
        }
    }
}


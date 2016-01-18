package com.example.cardviewsample;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.ViewHolder> {
    private LayoutInflater mLayoutInflater;
    private ArrayList<String> mDataList;

    public SampleAdapter(Context context, ArrayList<String> dataList) {
        super();
        mLayoutInflater = LayoutInflater.from(context);
        mDataList = dataList;

    }

    // リソースからViewを取得してViewHolderを生成して返す。viewTypeも引数で取得可能なので
    // ポジションに応じたViewの出し分けができる
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

    //ArrayAdapterのgetViewの部分
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        String data = (String) mDataList.get(position);
        holder.text.setText(data);

    }

    // リストの１行分を表すViewHolder。ここでイベントの設定などもおこなう→できなかった
    //再利用されるViewを内包する、高速化のため
    // ViewHolder内でwidgetを割り当てる
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;

        public ViewHolder(View v) {
            //v = adapter_sample.xml
            super(v);
            text = (TextView) v.findViewById(R.id.text);

            View.OnClickListener listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text.setTextSize(20);
                }
            };

            v.setOnClickListener(listener);

        }
    }


}


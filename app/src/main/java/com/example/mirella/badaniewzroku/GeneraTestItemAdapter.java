package com.example.mirella.badaniewzroku;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by patry on 16.05.2018.
 */

public class GeneraTestItemAdapter extends RecyclerView.Adapter<GeneraTestItemAdapter.ViewHolder> {

    private ArrayList<GeneralTestItem> itemList =new ArrayList<>();


    GeneraTestItemAdapter(ArrayList<GeneralTestItem>itemList) {
        this.itemList=itemList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_text_item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setText(itemList.get(position).getChangeText());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.textViewGeneralTest)
        TextView textViewGeneralTest;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
        private void setText(String text)
        {
            textViewGeneralTest.setText(text);
        }
    }
}

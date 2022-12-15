package com.example.kalkulatoruas13917;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SharedPreferenceAdapter extends RecyclerView.Adapter<SharedPreferenceAdapter.ExampleViewHolder> {
    private final ArrayList<ItemList> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewNumber1;
        public TextView mTextViewOperation;
        public TextView mTextViewNumber2;
        public TextView mTextViewResult;

        @SuppressLint("CutPasteId")
        public ExampleViewHolder(View itemView) {
            super(itemView);
            mTextViewNumber1 = itemView.findViewById(R.id.textview_number1);
            mTextViewOperation = itemView.findViewById(R.id.textview_operation);
            mTextViewNumber2 = itemView.findViewById(R.id.textview_number2);
            mTextViewResult = itemView.findViewById(R.id.textview_result);
        }
    }

    public SharedPreferenceAdapter(ArrayList<ItemList> exampleList) {
        mExampleList = exampleList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ItemList currentItem = mExampleList.get(position);

        holder.mTextViewNumber1.setText(currentItem.getNumber1());
        holder.mTextViewOperation.setText(currentItem.getOperation());
        holder.mTextViewNumber2.setText(currentItem.getNumber2());
        holder.mTextViewResult.setText(currentItem.getResult());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}

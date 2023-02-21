package com.example.recyclerview_demo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    public TextView textList;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        textList = itemView.findViewById(R.id.textList);

    }
}

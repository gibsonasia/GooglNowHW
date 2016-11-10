package com.example.asiagibson.googlenow;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by asiagibson on 11/7/16.
 */

public class RTaskViewHolder extends RecyclerView.ViewHolder {
    private View mView;

    private TextView textView;


    public RTaskViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;
        textView = (TextView) itemView.findViewById(R.id.header_title);

    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.cardview, parent, false);

    }

    public void bind(String holderTask) {
       textView.setText(holderTask);
    }
}


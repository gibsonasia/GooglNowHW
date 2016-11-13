package com.example.asiagibson.googlenow;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TranslateViewHolder extends RecyclerView.ViewHolder implements GoogleNowCard {
    private final View mView;
    private final TextView translateTv;

    public TranslateViewHolder(ViewGroup parent) {
        super(inflateview(parent));
        mView = itemView;
        translateTv = (TextView) mView.findViewById(R.id.translate_tv);
    }

    private static View inflateview(ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return layoutInflater.inflate(R.layout.translate_view_holder, parent, false);
    }

    public void bind(GoogleNowCard googleNowCard) {
        translateTv.setText("HELLO TRANSLATE");
    }
}

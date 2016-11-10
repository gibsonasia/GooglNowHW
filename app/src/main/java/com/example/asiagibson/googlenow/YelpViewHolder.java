package com.example.asiagibson.googlenow;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.BreakIterator;

public class YelpViewHolder extends RecyclerView.ViewHolder implements GoogleNowCard {
    private final View mView;
    private TextView yelpTv;

    public YelpViewHolder(ViewGroup parent) {
        super(inflateview(parent));
        mView = itemView;
        yelpTv = (TextView) mView.findViewById(R.id.yelp_tv);
    }

    private static View inflateview(ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return layoutInflater.inflate(R.layout.yelp_view_holder, parent, false);
    }

    public void bind(GoogleNowCard googleNowCard) {
        yelpTv.setText("Yelp me a restaurant my boy");
    }
}

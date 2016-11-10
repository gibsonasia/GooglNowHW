package com.example.asiagibson.googlenow;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ReminderViewHolder extends RecyclerView.ViewHolder implements GoogleNowCard {
    private final View mView;
    private final TextView reminderTv;

    public ReminderViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;
        reminderTv = (TextView) mView.findViewById(R.id.reminder_tv);

    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.reminder_view_holder, parent, false);
    }

    public void bind(GoogleNowCard googleNowCard) {
        reminderTv.setText("REMIND ME OF SOMETHING");
    }
}

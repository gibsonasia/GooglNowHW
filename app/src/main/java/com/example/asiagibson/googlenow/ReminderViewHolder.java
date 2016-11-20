package com.example.asiagibson.googlenow;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ReminderViewHolder extends RecyclerView.ViewHolder implements GoogleNowCard {
    SharedPreferences sharedPreferences;
    public static String MYPREFERENCES = "MyPref";
    public static String input = "inputKey";

    private View mView;
    public ImageView imageView;
    public EditText editText;


    private TextView textView;


    public ReminderViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;
        textView = (TextView) itemView.findViewById(R.id.header_title);
        imageView = (ImageView) itemView.findViewById(R.id.date_cal);


    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.cardview, parent, false);

    }

    public void bind(GoogleNowCard googleNowCard) {
        ReminderCard reminderCard = (ReminderCard) googleNowCard;
        String cardTitle = reminderCard.getCardTitle();
        switch (cardTitle) {
            case "Urgent":
                mView.setBackgroundColor(Color.parseColor("#ff6666"));
                break;
            case "App Idea":
                mView.setBackgroundColor(Color.parseColor("#ffff4d"));
                break;
            case "Reminder":
                mView.setBackgroundColor(Color.parseColor("#66ff99"));
                break;
            case "Pack Lunch":
                mView.setBackgroundColor(Color.parseColor("#1ad1ff"));
                break;
        }

        editText = (EditText) itemView.findViewById(R.id.edit_text);
        imageView = (ImageView) itemView.findViewById(R.id.date_cal);
        imageView.setClickable(true);
        Context ctx = itemView.getContext();
        final SharedPreferences sharedPreferences = ctx.getSharedPreferences(MYPREFERENCES, Context.MODE_PRIVATE);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1 = editText.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(input, input1);
                editor.apply();

            }
        });
    }


}



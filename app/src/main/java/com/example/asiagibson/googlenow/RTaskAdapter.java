package com.example.asiagibson.googlenow;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

/**
 * Created by asiagibson on 11/7/16.
 */

public class RTaskAdapter extends RecyclerView.Adapter {

    private List<String> mRTaskList = Arrays.asList(

            "Urgernt",
            "Reminder",
            "Cook",
            "PackLunch",
            "Urgernt",
            "Reminder",
            "Cook",
            "PackLunch",
            "Urgernt",
            "Reminder",
            "Cook",
            "PackLunch"

    );

    @Override
    public RTaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RTaskViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RTaskViewHolder taskHolder = (RTaskViewHolder) holder;
        String holderTask = mRTaskList.get(position);
        taskHolder.bind(holderTask);
    }

    @Override
    public int getItemCount() {
        return mRTaskList.size();
    }
}

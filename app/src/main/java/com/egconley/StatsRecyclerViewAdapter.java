package com.egconley;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StatsRecyclerViewAdapter extends RecyclerView.Adapter<StatsRecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "egc.MovesRVAdapter";

    private Context mContext;
    private List<String> mItems = new ArrayList();
    int parentLayoutID;
    int listLayoutID;
    int itemViewID;

    // default constructor
    public StatsRecyclerViewAdapter(Context mContext, List<String> mItems, int parentLayoutID, int listLayoutID, int itemViewID) {
        this.mItems = mItems;
        this.mContext = mContext;
        this.parentLayoutID = parentLayoutID;
        this.listLayoutID = listLayoutID;
        this.itemViewID = itemViewID;
    }

    @NonNull
    @Override
    public StatsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(parentLayoutID, parent, false);
        StatsRecyclerViewAdapter.ViewHolder holder = new StatsRecyclerViewAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull StatsRecyclerViewAdapter.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder called.");

        holder.item.setText(mItems.get(position));

        holder.listLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Clicked on: " + mItems.get(position));

            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView item;
        ConstraintLayout listLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item = itemView.findViewById(itemViewID);
            listLayout = itemView.findViewById(listLayoutID);
        }
    }
}

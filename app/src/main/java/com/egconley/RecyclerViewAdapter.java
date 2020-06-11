package com.egconley;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

// REQ 2: Render the list of 7 pokemon in a RecyclerView and use ConstraintLayout to display the ui of each pokemon.
// Resource used: https://www.youtube.com/watch?v=Vyqz_-sJGFk
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "egc.RecyclerViewAdapter";

    private Context mContext;
    private List<Pokemon> mPokemon = new ArrayList();

    // default constructor
    public RecyclerViewAdapter(Context mContext, List<Pokemon> mPokemon) {
        this.mPokemon = mPokemon;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder called.");

        Glide.with(mContext)
                .load(mPokemon.get(position).getImgUrl1())
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(holder.pokemonPic);
        holder.pokemonName.setText("Name: " + mPokemon.get(position).name);
        holder.level.setText("Level: 34");
        holder.pokemonTypes.setText("Types: " + mPokemon.get(position).getTypes());

        holder.listItemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Clicked on: " + mPokemon.get(position).name);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPokemon.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView pokemonPic;
        TextView pokemonName;
        TextView level;
        TextView pokemonTypes;
        ConstraintLayout listItemLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pokemonPic = itemView.findViewById(R.id.imageview);
            pokemonName = itemView.findViewById(R.id.name_textview);
            level = itemView.findViewById(R.id.level_textview);
            pokemonTypes = itemView.findViewById(R.id.types_textview);
            listItemLayout = itemView.findViewById(R.id.list_item_layout);
        }
    }
}

package com.egconley;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

// REQ 4: When a pokemon is clicked it should show the detail view of the selected pokemon.
public class DetailViewActivity extends AppCompatActivity {

    private static final String TAG = "egc.DetailViewActivity";

    Bundle extras;
    ArrayList<String> xMoves;

    ArrayList<String> xAbilities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        initStatsRecyclerViews();
    }

    @Override
    protected void onResume() {
        super.onResume();

        extras = getIntent().getExtras();

        String xFrontPic = extras.getString("kFrontPic");
        ImageView frontPic = findViewById(R.id.front_imageView);
        Glide.with(this)
                .load(xFrontPic)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(frontPic);

        String xBackPic = extras.getString("kBackPic");
        ImageView backPic = findViewById(R.id.back_imageView);
        Glide.with(this)
                .load(xBackPic)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(backPic);

        String xName = extras.getString("kName");
        TextView bigName = findViewById(R.id.detail_bigName_textView);
        bigName.setText(xName);
        TextView name = findViewById(R.id.detail_name_textView);
        name.setText("Name: " + xName);

        String xWeight = extras.getString("kWeight");
        TextView weight = findViewById(R.id.detail_weight_textView);
        weight.setText("Weight: " + xWeight);

        String xTypes = extras.getString("kTypes");
        TextView types = findViewById(R.id.detail_types_textView);
        types.setText("Types: " + xTypes);

        String xNumber = extras.getString("kNumber");
        TextView number = findViewById(R.id.detail_number_textView);
        number.setText("Pokemon Number: " + xNumber);

        String xWHeight = extras.getString("kHeight");
        TextView height = findViewById(R.id.detail_height_textView);
        height.setText("Height: " + xWHeight);

        xAbilities = extras.getStringArrayList("abilities");
        xMoves = extras.getStringArrayList("moves");

        initStatsRecyclerViews();
    }

    private void initStatsRecyclerViews() {
        Log.d(TAG, "initRecyclerView");
        RecyclerView movesRecyclerView = findViewById(R.id.detail_moves_recyclerView);
        StatsRecyclerViewAdapter adapter = new StatsRecyclerViewAdapter(this, xMoves, R.layout.layout_moveslist, R.id.moveslist_layout, R.id.move_textView);
        movesRecyclerView.setAdapter(adapter);
        movesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView abilitiesRecyclerView = findViewById(R.id.detail_abilities_recyclerView);
        StatsRecyclerViewAdapter abilitiesAdapter = new StatsRecyclerViewAdapter(this, xAbilities, R.layout.layout_abilitieslist, R.id.abilities_listlayout, R.id.ability_textView);
        abilitiesRecyclerView.setAdapter(abilitiesAdapter);
        abilitiesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

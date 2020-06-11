package com.egconley;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "egc.MainActivity";

    private List<Pokemon> starterTeam = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "On Create started.");

        starterTeam = StarterTeam.generateStarterTeam();
        StringBuilder names = new StringBuilder();
        names.append(starterTeam.get(0).name);
        ListIterator listIterator = starterTeam.listIterator(0);
        while (listIterator.hasNext()) {
            names.append(", " + listIterator.next());
        }

        Log.i(TAG, "STARTER TEAM: " + names.toString());

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView");
        starterTeam = StarterTeam.generateStarterTeam();
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, starterTeam);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

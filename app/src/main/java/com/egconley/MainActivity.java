package com.egconley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String tag = "egconley";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(tag, "On Create");

        Pokemon[] starterTeam = StarterTeam.generateStarterTeam();
        StringBuilder teamNames = new StringBuilder();
        for (int i=0; i<starterTeam.length; i++) {
            teamNames.append(starterTeam[i].name);
            teamNames.append(" ");
        }

        Log.i(tag, "STARTER TEAM: " + teamNames.toString());
    }
}

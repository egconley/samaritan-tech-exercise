package com.egconley;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.egconley.pokemonAPI.PokemonAPIService;
import com.egconley.pokemonAPI.models.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.egconley.util.RandomNumberSetGenerator.getRandomNumberSet;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "egc.MainActivity";

    // REQ 5 Connect Pokedex Client App to The open Pokemon API using Retro fit
    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/pokemon/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private PokemonAPIService pokemonAPIService = retrofit.create(PokemonAPIService.class);

    private List<Pokemon> apiStarterTeam = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "On Create started.");

        getStarterTeam();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        MainRecyclerViewAdapter adapter = new MainRecyclerViewAdapter(this, apiStarterTeam);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // REQ 5
    // REQ 5.1 Generate a list of 7 random different numbers between 1-151. These numbers corresponds to pokemon_numbers
    private void getStarterTeam() {
        Set<Integer> set = getRandomNumberSet();
        for (Integer i : set) {
            getPokemon(i);
        }
    }

    // REQ 5.2 Fetch the pokemon using those pokemon_numbers to call the endpoint https://pokeapi.co/api/v2/pokemon/{pokemon_number}/
    private void getPokemon(int number) {
        Call<Pokemon> call = pokemonAPIService.getPokemonBySpeciesNumber(""+number);
        call.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                if (!response.isSuccessful()) {
                    Log.d(TAG, "Response Code: " + response.code());
                    return;
                }

                Pokemon pokemon = response.body();
                apiStarterTeam.add(pokemon);

                initRecyclerView();
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                Log.d(TAG, "Oh no!!! " + t.getMessage());
            }
        });
    }
}

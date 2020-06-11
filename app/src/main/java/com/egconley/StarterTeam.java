package com.egconley;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// REQ 1: Hard code a list of 7 pokemon those will be your starter pokemon team.
public class StarterTeam {

    public static List<Pokemon> generateStarterTeam() {

        List<Pokemon> starterTeam = new ArrayList<>();

        Pokemon growlithe;
        Pokemon charmander;
        Pokemon dratini;
        Pokemon bulbasaur;
        Pokemon psyduck;
        Pokemon magikarp;
        Pokemon cyndaquil;

        List<String> growlitheTypes;
        List<String> growlitheMoves;
        List<String> growlitheAbilities;

        List<String> charmanderTypes;
        List<String> charmanderMoves;
        List<String> charmanderAbilities;

        List<String> dratiniTypes;
        List<String> dratiniMoves;
        List<String> dratiniAbilities;

        List<String> bulbasaurTypes;
        List<String> bulbasaurMoves;
        List<String> bulbasaurAbilities;

        List<String> psyduckTypes;
        List<String> psyduckMoves;
        List<String> psyduckAbilities;

        List<String> magikarpTypes;
        List<String> magikarpMoves;
        List<String> magikarpAbilities;

        List<String> cyndaquilTypes;
        List<String> cyndaquilMoves;
        List<String> cyndaquilAbilities;

        growlitheTypes = new LinkedList<>();
        growlitheTypes.add("fire");
        growlitheMoves = new LinkedList<>();
        growlitheMoves.add("double-kick");
        growlitheMoves.add("headbutt");
        growlitheMoves.add("body-slam");
        growlitheAbilities = new LinkedList<>();
        growlitheAbilities.add("intimidate");
        growlitheAbilities.add("flash-fire");
        growlitheAbilities.add("justified");
        growlithe = new Pokemon("Growlithe", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/58.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/58.png", 58, 190, 7, growlitheTypes, growlitheMoves, growlitheAbilities);

        charmanderTypes = new LinkedList<>();
        charmanderTypes.add("fire");
        charmanderMoves = new LinkedList<>();
        charmanderMoves.add("mega-punch");
        charmanderMoves.add("fire-punch");
        charmanderMoves.add("thunder-punch");
        charmanderAbilities = new LinkedList<>();
        charmanderAbilities.add("blaze");
        charmanderAbilities.add("solar-power");
        charmander = new Pokemon("Charmander", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/4.png", 4, 85, 6, charmanderTypes, charmanderMoves, charmanderAbilities);

        dratiniTypes = new LinkedList<>();
        dratiniTypes.add("dragon");
        dratiniMoves = new LinkedList<>();
        dratiniMoves.add("bind");
        dratiniMoves.add("slam");
        dratiniMoves.add("headbutt");
        dratiniAbilities = new LinkedList<>();
        dratiniAbilities.add("shed-skin");
        dratiniAbilities.add("marvel-scale");
        dratini = new Pokemon("Dratini", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/147.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/147.png", 147, 33, 18, dratiniTypes, dratiniMoves, dratiniAbilities);

        bulbasaurTypes = new LinkedList<>();
        bulbasaurTypes.add("grass");
        bulbasaurTypes.add("poison");
        bulbasaurMoves = new LinkedList<>();
        bulbasaurMoves.add("razor-wind");
        bulbasaurMoves.add("swords-dance");
        bulbasaurMoves.add("bind");
        bulbasaurAbilities = new LinkedList<>();
        bulbasaurAbilities.add("overgrow");
        bulbasaurAbilities.add("chlorophyll");
        bulbasaur = new Pokemon("Bulbasaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/1.png", 1, 69, 7, bulbasaurTypes, bulbasaurMoves, bulbasaurAbilities);

        psyduckTypes = new LinkedList<>();
        psyduckTypes.add("water");
        psyduckMoves = new LinkedList<>();
        psyduckMoves.add("mega-punch");
        psyduckMoves.add("pay-day");
        psyduckMoves.add("ice-punch");
        psyduckAbilities = new LinkedList<>();
        psyduckAbilities.add("damp");
        psyduckAbilities.add("cloud-nine");
        psyduckAbilities.add("swift-swim");
        psyduck = new Pokemon("Psyduck", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/54.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/54.png", 54, 196, 8, psyduckTypes, psyduckMoves, psyduckAbilities);

        magikarpTypes = new LinkedList<>();
        magikarpTypes.add("water");
        magikarpMoves = new LinkedList<>();
        magikarpMoves.add("tackle");
        magikarpMoves.add("splash");
        magikarpMoves.add("flail");
        magikarpAbilities = new LinkedList<>();
        magikarpAbilities.add("swift-swim");
        magikarpAbilities.add("rattled");
        magikarp = new Pokemon("Magikarp", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/129.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/129.png", 129, 100, 9, magikarpTypes, magikarpMoves, magikarpAbilities);

        cyndaquilTypes = new LinkedList<>();
        cyndaquilTypes.add("fire");
        cyndaquilMoves = new LinkedList<>();
        cyndaquilMoves.add("cut");
        cyndaquilMoves.add("double-kick");
        cyndaquilMoves.add("headbutt");
        cyndaquilAbilities = new LinkedList<>();
        cyndaquilAbilities.add("blaze");
        cyndaquilAbilities.add("flash-fire");
        cyndaquil = new Pokemon("Cyndaquil", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/155.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/155.png", 155, 79, 5, cyndaquilTypes, charmanderMoves, cyndaquilAbilities);

        starterTeam.add(growlithe);
        starterTeam.add(charmander);
        starterTeam.add(dratini);
        starterTeam.add(bulbasaur);
        starterTeam.add(psyduck);
        starterTeam.add(magikarp);
        starterTeam.add(cyndaquil);

        return starterTeam;
    }
}

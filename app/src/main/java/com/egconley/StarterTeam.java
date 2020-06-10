package com.egconley;

import java.util.LinkedList;
import java.util.List;

// REQ 1: Hard code a list of 7 pokemon those will be your starter pokemon team.
public class StarterTeam {

    public static Pokemon[] generateStarterTeam() {

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

        growlithe = new Pokemon("Growlithe", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/58.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/58.png", 58, 190, 7);
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

        charmander = new Pokemon("Charmander", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/4.png", 4, 85, 6);
        charmanderTypes = new LinkedList<>();
        charmanderTypes.add("fire");
        charmanderMoves = new LinkedList<>();
        charmanderMoves.add("mega-punch");
        charmanderMoves.add("fire-punch");
        charmanderMoves.add("thunder-punch");
        charmanderAbilities = new LinkedList<>();
        charmanderAbilities.add("blaze");
        charmanderAbilities.add("solar-power");

        dratini = new Pokemon("Dratini", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/147.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/147.png", 147, 33, 18);
        dratiniTypes = new LinkedList<>();
        dratiniTypes.add("dragon");
        dratiniMoves = new LinkedList<>();
        dratiniMoves.add("bind");
        dratiniMoves.add("slam");
        dratiniMoves.add("headbutt");
        dratiniAbilities = new LinkedList<>();
        dratiniAbilities.add("shed-skin");
        dratiniAbilities.add("marvel-scale");

        bulbasaur = new Pokemon("Bulbasaur", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/1.png", 1, 69, 7);
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

        psyduck = new Pokemon("Psyduck", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/54.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/54.png", 54, 196, 8);
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

        magikarp = new Pokemon("Magikarp", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/129.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/129.png", 129, 100, 9);
        magikarpTypes = new LinkedList<>();
        magikarpTypes.add("water");
        magikarpMoves = new LinkedList<>();
        magikarpMoves.add("tackle");
        magikarpMoves.add("splash");
        magikarpMoves.add("flail");
        magikarpAbilities = new LinkedList<>();
        magikarpAbilities.add("swift-swim");
        magikarpAbilities.add("rattled");

        cyndaquil = new Pokemon("Cyndaquil", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/155.png", "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/155.png", 155, 79, 5);
        cyndaquilTypes = new LinkedList<>();
        cyndaquilTypes.add("fire");
        cyndaquilMoves = new LinkedList<>();
        cyndaquilMoves.add("cut");
        cyndaquilMoves.add("double-kick");
        cyndaquilMoves.add("headbutt");
        cyndaquilAbilities = new LinkedList<>();
        cyndaquilAbilities.add("blaze");
        cyndaquilAbilities.add("flash-fire");

        return new Pokemon[]{growlithe, charmander, dratini, bulbasaur, psyduck, magikarp, cyndaquil};
    }
}

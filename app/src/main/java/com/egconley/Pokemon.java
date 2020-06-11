package com.egconley;

import java.util.List;
import java.util.ListIterator;

public class Pokemon {

    private static final String TAG = "egc.Pokemon";

    String name;
    private String imgUrl1;
    private String imgUrl2;
    private int speciesNumber;
    private int weight;
    private int height;
    private List<String> types;
    private List<String> moves;
    private List<String> abilities;

    // default constructor
    public Pokemon() {

    }

    // constructor
    public Pokemon(String name, String imgUrl1, String imgUrl2, int speciesNumber, int weight, int height, List<String> types, List<String> moves, List<String> abilities) {
        this.name = name;
        this.imgUrl1 = imgUrl1;
        this.imgUrl2 = imgUrl2;
        this.speciesNumber = speciesNumber;
        this.weight = weight;
        this.height = height;
        this.types = types;
        this.moves = moves;
        this.abilities = abilities;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl1() {
        return imgUrl1;
    }

    public void setImgUrl1(String imgUrl1) {
        this.imgUrl1 = imgUrl1;
    }

    public String getImgUrl2() {
        return imgUrl2;
    }

    public void setImgUrl2(String imgUrl2) {
        this.imgUrl2 = imgUrl2;
    }

    public int getSpeciesNumber() {
        return speciesNumber;
    }

    public void setSpeciesNumber(int speciesNumber) {
        this.speciesNumber = speciesNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getTypes() {
        if (types.size()==1) {
            return types.get(0);
        } else {
            StringBuilder builder = new StringBuilder();
            builder.append(types.get(0));
            ListIterator listIterator = types.listIterator(1);
            while (listIterator.hasNext()) {
                builder.append(", " + listIterator.next());
            }
            return builder.toString();
        }
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getMoves() {
        return moves;
    }

    public void setMoves(List<String> moves) {
        this.moves = moves;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }
}

package com.egconley.util;

import java.util.ArrayList;

public class FirstLetterCapitalizer {

    public static ArrayList<String> capitalizeStringsInArray(ArrayList<String> list) {
        ArrayList<String> capitalized = new ArrayList<>();
        for (String s : list) {
            capitalized.add(capitalizeFirstLetter(s));
        }
        return capitalized;
    }

    public static String capitalizeFirstLetter(String text) {
        StringBuilder builder = new StringBuilder();
        builder.append(text.substring(0, 1).toUpperCase());
        builder.append(text.substring(1));
        return builder.toString();
    }

}

package com.egconley.util;

import android.util.Log;

import java.util.HashSet;
import java.util.Set;

public class RandomNumberSetGenerator {

    private static final String TAG = "RandomNumberSetGenerato";
    public static Set<Integer> getRandomNumberSet() {

        Set<Integer> set = new HashSet<>();

        int max = 151;
        int min = 1;
        int range = max - min + 1;

        while (set.size()<7) {
            int random = (int)(Math.random() * range) + min;
            set.add(random);
        }

        Log.d(TAG, set.toString());
        return set;
    }
}

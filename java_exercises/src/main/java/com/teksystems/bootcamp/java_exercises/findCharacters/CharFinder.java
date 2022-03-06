package com.teksystems.bootcamp.java_exercises.findCharacters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CharFinder {

    private static String charsToFind;
    private static String stringToSearch;

    public static HashMap<Character, List<Integer>> findMatchPositions(String charsToFind, String stringToSearch) {

        HashMap<Character, List<Integer>> map = new HashMap<>();

        for (char c : charsToFind.toCharArray()) {

            ArrayList<Integer> locations = new ArrayList<>();
            map.put(c, locations);
        }
        return map;
    }
}

//CharFinder
//    public static HashMap<Char, List<Int>> findMatchPositions(String charsToFind, String stringToSearch);
//        returns a list of unique characters in the first argument and positions where those characters were found in the second argument

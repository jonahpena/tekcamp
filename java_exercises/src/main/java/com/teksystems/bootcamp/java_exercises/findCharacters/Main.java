package com.teksystems.bootcamp.java_exercises.findCharacters;

import java.util.HashMap;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input character to search for: ");

        String charsToFind = scanner.nextLine();

        System.out.println("String to search for those character in: ");

        String stringToSearch = scanner.nextLine();

        HashMap<Character, List <Integer>> foundChar = CharFinder.findMatchPositions(charsToFind, stringToSearch);

        System.out.println("Your locations are: " + foundChar);

    }

}

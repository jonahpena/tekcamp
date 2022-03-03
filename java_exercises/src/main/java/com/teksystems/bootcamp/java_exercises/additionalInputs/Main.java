package com.teksystems.bootcamp.java_exercises.additionalInputs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberAggregator aggregator = new NumberAggregator();

        int total = 0;
        System.out.println("Enter an Integer: ");

        int userInput = scanner.nextInt();

        while (scanner.hasNextInt()) {
            total = aggregator.addNumber(userInput);
            System.out.println("Enter another Integer to Add to the sum: ");
            userInput = scanner.nextInt();
        }
        System.out.println("The sum is: " + total);
    }
}
package com.teksystems.bootcamp.java_exercises.additionalInputs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberAggregator aggregator = new NumberAggregator();

        int total = 0;
        int userInput;

        System.out.println("Enter an Integer: ");

        while (scanner.hasNextInt()) {
            userInput = scanner.nextInt();
            total = aggregator.addNumber(userInput);
            System.out.println("Enter another Integer to Add to the sum: ");
        }
        System.out.println("The sum is: " + total);
    }
}
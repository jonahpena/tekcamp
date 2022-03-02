package com.teksystems.bootcamp.java_exercises.additionalInputs;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter an Integer: ");


        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput != 0) {
                total = total + userInput;
                System.out.println("Enter another Integer to Add to the sum: ");
            } else {
                System.out.println("The sum is: " + total);
            }
        }
    }
}
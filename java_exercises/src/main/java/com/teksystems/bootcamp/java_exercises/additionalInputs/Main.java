package com.teksystems.bootcamp.java_exercises.additionalInputs;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int total = 0;
        int temp = (input + total);

        while (true) {
            System.out.println("Enter an Integer to Add: ");
            input = scanner.nextInt();
            total = input + input;
            if(input >= 0 && input <= 10)
            break;
            {
                System.out.println("Your total is " + total);
            }
        }

    }
}
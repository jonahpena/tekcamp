package com.teksystems.bootcamp.java_exercises.factorByTwo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to be factored: ");

        int input = scanner.nextInt();

        Node abram = NodeCreator.createNode(input);

        System.out.println("Your number had " + abram.getCountOfTwos() + " 2s");

    }
}

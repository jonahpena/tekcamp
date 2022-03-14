package com.teksystems.bootcamp.capstone2;

import java.util.Scanner;

public class Input {

    public static int getFirstInput() {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice < 0 || choice > 4) {
            try {
                System.out.print("\nEnter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return choice;
    }

    public static int getToppingInput() {
        Scanner scanner = new Scanner(System.in);

        int secondChoice = -1;
        while (secondChoice < 0 || secondChoice > 2) {
            try {
                System.out.print("\nEnter your choice: ");
                secondChoice = Integer.parseInt(scanner.nextLine());
                Menu.chooseTopping(secondChoice);

            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return secondChoice;
    }

    public static int getDrinkInput() {
        Scanner scanner = new Scanner(System.in);

        int thirdChoice = -1;
        while (thirdChoice < 0 || thirdChoice > 2) {
            try {
                System.out.print("\nEnter your choice: ");
                thirdChoice = Integer.parseInt(scanner.nextLine());
                Menu.chooseDrink(thirdChoice);

            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return thirdChoice;
    }
    public static int getFourthInput() {
        Scanner scanner = new Scanner(System.in);

        int fourthChoice = -1;
        while (fourthChoice < 0 || fourthChoice > 2) {
            try {
                System.out.print("\nEnter your choice: ");
                fourthChoice = Integer.parseInt(scanner.nextLine());
                Menu.chooseSide(fourthChoice);

            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return fourthChoice;
    }
    public static int getFifthInput() {
        Scanner scanner = new Scanner(System.in);

        int fifthChoice = -1;
        while (fifthChoice < 0 || fifthChoice > 2) {
            try {
                System.out.print("\nEnter your choice: ");
                fifthChoice = Integer.parseInt(scanner.nextLine());
                Menu.addItemOrCompleteOrder(fifthChoice);
                Menu.chooseTopping(fifthChoice);

            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return fifthChoice;
    }
}
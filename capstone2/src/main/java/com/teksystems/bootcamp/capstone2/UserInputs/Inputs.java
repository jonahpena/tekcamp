package com.teksystems.bootcamp.capstone2.UserInputs;

import com.teksystems.bootcamp.capstone2.Menu;

import java.util.Scanner;

public class Inputs {

    public static int getEntreeInput() {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        while (choice < 0 || choice > 8) {
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
        while (secondChoice < 0 || secondChoice > 8) {
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
        while (thirdChoice < 0 || thirdChoice > 8) {
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

    public static int getSideInput() {
        Scanner scanner = new Scanner(System.in);

        int fourthChoice = -1;
        while (fourthChoice < 0 || fourthChoice > 8) {
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

    public static int getAdditionalOrderInput() {
        Scanner scanner = new Scanner(System.in);

        int additionalOrderChoice = -1;
        while (additionalOrderChoice < 0 || additionalOrderChoice > 8) {
            try {
                System.out.print("\nEnter your choice: ");
                additionalOrderChoice = Integer.parseInt(scanner.nextLine());
                Menu.AdditionalOrderOptions(additionalOrderChoice);

            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return additionalOrderChoice;
    }
}
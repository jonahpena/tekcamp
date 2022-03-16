package com.teksystems.bootcamp.capstone2.UserInterface;

public class UserInterface {
    public static void printWelcome() {
        System.out.println("+-----------------------------------+");
        System.out.println("|         Welcome to Jonah's        |");
        System.out.println("|            Poke Palace            |");
        System.out.println("+-----------------------------------+");
        System.out.println("Welcome to the Poke Palace! \n\nPlease enter a number to select our menu options:");
    }
    public static void printEntreeMenu() {
        System.out.println("1. Aloha Special");
        System.out.println("2. Ono Special");
        System.out.println("3. Ohana Special");
        System.out.println("4. Mahalo Special");
        System.out.println("5. Choose a Drink");
        System.out.println("6. Choose a Side");
        System.out.println("0. Exit");
    }
    public static void printToppingMenu() {
        System.out.println("\nChoose any toppings you'd like to add:");
        System.out.println("1. Furikake");
        System.out.println("2. Ginger");
        System.out.println("3. Masago");
        System.out.println("4. Wasabi");
        System.out.println("5. Choose your drink");
        System.out.println("6. Choose your side");
        System.out.println("7. Add another Entree");
        System.out.println("8. Complete your Entree");
        System.out.println("0. Exit");
    }
    public static void printDrinkMenu() {
        System.out.println("\nChoose your drink of choice.");
        System.out.println("1. Sprite");
        System.out.println("2. Coke");
        System.out.println("3. Root-Beer");
        System.out.println("4. Water");
        System.out.println("5. Choose your side");
        System.out.println("6. Go back to add more toppings");
        System.out.println("7. Add another Entree");
        System.out.println("8. Complete your Order");
        System.out.println("0. Exit");
    }
    public static void printSideMenu() {
        System.out.println("\nChoose your sides:");
        System.out.println("1. Edamame");
        System.out.println("2. Crab ball");
        System.out.println("3. Spam Musubi");
        System.out.println("4. Nori");
        System.out.println("5. Go back to add more toppings");
        System.out.println("6. Go back to add another drink");
        System.out.println("7. Add another Entree");
        System.out.println("8. Complete your Order");
        System.out.println("0. Exit");
    }
    public static void additionalOrderOptionsMenu() {
        System.out.println("\nThank you for choosing The Poke Palace! Your receipt is displayed Above.");
        System.out.println("1. Enter 1 to Add an additional order");
        System.out.println("0. Enter 0 to Exit");
    }
}

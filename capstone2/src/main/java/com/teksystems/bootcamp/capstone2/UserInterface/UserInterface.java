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
        System.out.println("1. Aloha Special ----------------- $12.99");
        System.out.println("2. Ono Special ------------------- $12.99");
        System.out.println("3. Ohana Special ----------------- $12.99");
        System.out.println("4. Mahalo Special ---------------- $12.99");
        System.out.println(" ");
        System.out.println("5. See Combo Menu");
        System.out.println("6. Choose Drink");
        System.out.println("7. Choose Side");
        System.out.println(" ");
        System.out.println("0. Exit");
    }

    public static void printToppingMenu() {
        System.out.println("\nChoose any toppings you'd like to add:");
        System.out.println("1. Furikake --------------------- $0.20");
        System.out.println("2. Ginger ----------------------- $0.20");
        System.out.println("3. Masago ----------------------- $0.20");
        System.out.println("4. Wasabi ----------------------- $0.20");
        System.out.println(" ");
        System.out.println("5. Choose drink");
        System.out.println("6. Choose side");
        System.out.println("7. Add another Entree");
        System.out.println("8. Complete Entree");
        System.out.println(" ");
        System.out.println("8. Complete your Order");
        System.out.println("0. Exit");
    }

    public static void printDrinkMenu() {
        System.out.println("\nChoose your drink of choice.");
        System.out.println("1. Sprite ---------------------- $1.99");
        System.out.println("2. Coke ------------------------ $1.99");
        System.out.println("3. Root-Beer ------------------- $1.99");
        System.out.println("4. Water ----------------------- $1.99");
        System.out.println(" ");
        System.out.println("5. Choose your side");
        System.out.println("6. Add more toppings");
        System.out.println("7. Add another Entree");
        System.out.println(" ");
        System.out.println("8. Complete your Order");
        System.out.println("0. Exit");
    }

    public static void printSideMenu() {
        System.out.println("\nChoose your sides:");
        System.out.println("1. Edamame --------------------- $2.99");
        System.out.println("2. Crab ball ------------------- $2.99");
        System.out.println("3. Spam Musubi ----------------- $2.99");
        System.out.println("4. Nori ------------------------ $2.99");
        System.out.println(" ");
        System.out.println("5. Add more toppings");
        System.out.println("6. Add another drink");
        System.out.println("7. Add another Entree");
        System.out.println(" ");
        System.out.println("8. Complete your Order");
        System.out.println("0. Exit");
    }

    public static void printComboMenu() {
        System.out.println("\nChoose a pre-defined Combo or build your own!");
        System.out.println("\n1. Aloha Combo - \nThe Aloha Special, with a side of Edamame, and a cup of Ice water\n");
        System.out.println("2. Ono Combo - \nThe Ono Special, with two Crab balls, and a cup of Ice water\n");
        System.out.println("3. Ohana Combo - \nThe Ohana Special, with a side of Spam Musubi, and a cup of Ice water\n");
        System.out.println("4. Mahalo Combo - \nThe Mahalo Special, with a side of Nori, and a cup of Ice water\n");
        System.out.println(" ");
        System.out.println("5. Add more toppings");
        System.out.println("6. Add another drink");
        System.out.println("7. Add another Entree");
        System.out.println(" ");
        System.out.println("8. Complete your Order");
        System.out.println("0. Exit");
    }

    public static void additionalOrderOptionsMenu() {
        System.out.println("\nThank you for choosing The Poke Palace! Your receipt is displayed Above.");
        System.out.println("1. Enter 1 to Add an additional order");
        System.out.println("2. Enter 2 to View your previous orders");
        System.out.println("0. Enter 0 to Exit");
    }
}

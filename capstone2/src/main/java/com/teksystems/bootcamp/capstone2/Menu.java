package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddDrink.AddCoke;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddDrink.AddRootBeer;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddDrink.AddSprite;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddDrink.AddWater;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddEntree.AddAlohaEntree;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddEntree.AddMahaloEntree;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddEntree.AddOhanaEntree;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddEntree.AddOnoEntree;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddSide.AddCrabBall;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddSide.AddEdamame;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddSide.AddNori;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddSide.AddSpamMusubi;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddTopping.AddFurikakeTopping;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddTopping.AddGingerTopping;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddTopping.AddMasagoTopping;
import com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddTopping.AddWasabiTopping;
import com.teksystems.bootcamp.capstone2.UserInputs.Input;
import com.teksystems.bootcamp.capstone2.UserInterface.DisplayCurrentOrder;
import com.teksystems.bootcamp.capstone2.UserInterface.UserInterface;

public class Menu {
    boolean exit;

    public void generateWelcome() {
        UserInterface.printWelcome();
        UserInterface.printEntreeMenu();
        while (!exit) {
            int choice = Input.getEntreeInput();
            chooseEntree(choice);

        }
    }

    private void chooseEntree(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for using our application! Have a great day.");
                break;
            case 1:
                System.out.println("\nYou've chosen the Aloha Special for 12.99.");
                AddAlohaEntree.addToOrder();
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getToppingInput();
                break;
            case 2:
                System.out.println("\nYou've chosen the Ono Special for 12.99.");
                UserInterface.printToppingMenu();
                AddOnoEntree.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getToppingInput();
                break;
            case 3:
                System.out.println("\nYou've chosen the Ohana Special for 12.99.");
                UserInterface.printToppingMenu();
                AddOhanaEntree.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getToppingInput();
                break;
            case 4:
                System.out.println("\nYou've chosen the Mahalo Special for 12.99.");
                UserInterface.printToppingMenu();
                AddMahaloEntree.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getToppingInput();
                break;
            case 5:
                UserInterface.printDrinkMenu();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getDrinkInput();
                break;
            case 6:
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getSideInput();
                break;

        }
    }

    public static void chooseTopping(int choice) {
        boolean exit;
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for using our application! Have a great day.");
                break;
            case 1:
                System.out.println("\nYou've added Furikake to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printToppingMenu();
                AddFurikakeTopping.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getToppingInput();
                break;
            case 2:
                System.out.println("\nYou've added Ginger to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printToppingMenu();
                AddGingerTopping.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getToppingInput();
                break;
            case 3:
                System.out.println("\nYou've added Masago to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printToppingMenu();
                AddMasagoTopping.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getToppingInput();
                break;
            case 4:
                System.out.println("\nYou've added Wasabi to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printToppingMenu();
                AddWasabiTopping.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getToppingInput();
                break;
            case 5:
                UserInterface.printDrinkMenu();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getDrinkInput();
                break;
            case 6:
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getSideInput();
                break;
            case 7:
                DisplayCurrentOrder.displayCurrentOrder();
                UserInterface.printEntreeMenu();
                Input.getEntreeInput();
                break;
            case 8:
                Receipt.printReceipt();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getEntreeInput();

                break;
        }
    }

    public static void chooseDrink(int choice) {
        boolean exit;
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for using our application! Have a great day.");
                break;
            case 1:
                System.out.println("\nYou've added a Sprite to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printSideMenu();
                AddSprite.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getSideInput();
                break;
            case 2:
                System.out.println("\nYou've added a Coke to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printSideMenu();
                AddCoke.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getSideInput();
                break;
            case 3:
                System.out.println("\nYou've added a Root-Beer to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printSideMenu();
                AddRootBeer.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getSideInput();
                break;
            case 4:
                System.out.println("\nYou've added a Water to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printSideMenu();
                AddWater.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getSideInput();
                break;
            case 5:
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getSideInput();
                break;
            case 6:
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getToppingInput();
                break;
            case 7:
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getEntreeInput();
                break;
            case 8:
                DisplayCurrentOrder.displayCurrentOrder();
                Receipt.printReceipt();
                break;
        }
    }

    public static void chooseSide(int choice) {
        boolean exit;
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for using our application! Have a great day.");
                break;
            case 1:
                System.out.println("\nYou've added a side of Edamame to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printSideMenu();
                AddEdamame.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getSideInput();
                break;
            case 2:
                System.out.println("\nYou've added a Crab ball to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printSideMenu();
                AddCrabBall.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getSideInput();
                break;
            case 3:
                System.out.println("\nYou've added a side of Spam Musubi to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printSideMenu();
                AddSpamMusubi.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getSideInput();
                break;
            case 4:
                System.out.println("\nYou've added a side of Nori to your meal. \nUse the menu below to continue with your order.");
                UserInterface.printSideMenu();
                AddNori.addToOrder();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getSideInput();
                break;
            case 5:
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getToppingInput();
                break;
            case 6:
                UserInterface.printDrinkMenu();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getDrinkInput();
                break;
            case 7:
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder();
                Input.getEntreeInput();
                break;
            case 8:
                DisplayCurrentOrder.displayCurrentOrder();
                Receipt.printReceipt();
                break;
        }
    }

}
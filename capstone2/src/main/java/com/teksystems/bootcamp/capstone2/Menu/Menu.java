package com.teksystems.bootcamp.capstone2.Menu;

import com.teksystems.bootcamp.capstone2.Logic.MenuAddOns;
import com.teksystems.bootcamp.capstone2.UserInterface.OrderHistory;
import com.teksystems.bootcamp.capstone2.Logic.EditOrder;
import com.teksystems.bootcamp.capstone2.Order.Orders;
import com.teksystems.bootcamp.capstone2.Order.SaveOrder;
import com.teksystems.bootcamp.capstone2.UserInterface.DisplayCurrentOrder;
import com.teksystems.bootcamp.capstone2.UserInterface.UserInterface;
import com.teksystems.bootcamp.capstone2.Utility.Spacer;

public class Menu {
    static boolean exit;
    public static Orders currentOrder = new Orders();

    public void generateWelcome() {
        UserInterface.printWelcome();
        UserInterface.printEntreeMenu();
        while (!exit) {
            int choice = Inputs.getEntreeInput();
            chooseEntree(choice);
        }
    }

    private void chooseEntree(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for choosing The Poke Palace today! Have a great day.");
                break;
            case 1:
                Spacer.addSpacing();
                System.out.println("\nYou've chosen the Aloha Special for $12.99.");
                EditOrder.addToOrder(MenuAddOns.ALOHA, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 2:
                Spacer.addSpacing();
                System.out.println("\nYou've chosen the Ono Special for $12.99.");
                EditOrder.addToOrder(MenuAddOns.ONO, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 3:
                Spacer.addSpacing();
                System.out.println("\nYou've chosen the Ohana Special for $12.99.");
                EditOrder.addToOrder(MenuAddOns.OHANA, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 4:
                Spacer.addSpacing();
                System.out.println("\nYou've chosen the Mahalo Special for $12.99.");
                EditOrder.addToOrder(MenuAddOns.MAHALO, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 5:
                Spacer.addSpacing();
                UserInterface.printComboMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getComboInput();
                break;
            case 6:
                Spacer.addSpacing();
                UserInterface.printDrinkMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getDrinkInput();
                break;
            case 7:
                Spacer.addSpacing();
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 8:
                Spacer.addSpacing();
                currentOrder.printReceipt(currentOrder);
                UserInterface.additionalOrderOptionsMenu();
                Inputs.getAdditionalOrderInput();
                break;
        }
    }

    public static void chooseTopping(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for choosing The Poke Palace today! Have a great day.");
                break;
            case 1:
                Spacer.addSpacing();
                System.out.println("\nYou've added Furikake to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.FURIKAKE, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 2:
                Spacer.addSpacing();
                System.out.println("\nYou've added Ginger to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.GINGER, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 3:
                Spacer.addSpacing();
                System.out.println("\nYou've added Masago to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.MASAGO, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 4:
                Spacer.addSpacing();
                System.out.println("\nYou've added Wasabi to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.WASABI, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 5:
                Spacer.addSpacing();
                UserInterface.printDrinkMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getDrinkInput();
                break;
            case 6:
                Spacer.addSpacing();
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 7:
                Spacer.addSpacing();
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                break;
            case 8:
                Spacer.addSpacing();
                UserInterface.printDrinkMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getDrinkInput();
                break;
            case 9:
                Spacer.addSpacing();
                currentOrder.printReceipt(currentOrder);
                UserInterface.additionalOrderOptionsMenu();
                Inputs.getAdditionalOrderInput();
                break;
        }
    }

    public static void chooseDrink(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for choosing The Poke Palace today! Have a great day.");
                break;
            case 1:
                Spacer.addSpacing();
                System.out.println("\nYou've added a Sprite to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.SPRITE, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 2:
                Spacer.addSpacing();
                System.out.println("\nYou've added a Coke to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.COKE, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 3:
                Spacer.addSpacing();
                System.out.println("\nYou've added a Root-Beer to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.ROOTBEER, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 4:
                Spacer.addSpacing();
                System.out.println("\nYou've added a Water to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.WATER, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 5:
                Spacer.addSpacing();
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 6:
                Spacer.addSpacing();
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 7:
                Spacer.addSpacing();
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                ;
                break;
            case 8:
                Spacer.addSpacing();
                currentOrder.printReceipt(currentOrder);
                UserInterface.additionalOrderOptionsMenu();
                Inputs.getAdditionalOrderInput();
                break;
        }
    }

    public static void chooseSide(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for choosing The Poke Palace today! Have a great day.");
                break;
            case 1:
                Spacer.addSpacing();
                System.out.println("\nYou've added a side of Edamame to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.EDAMAME, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 2:
                Spacer.addSpacing();
                System.out.println("\nYou've added a Crab ball to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.CRABBALL, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 3:
                Spacer.addSpacing();
                System.out.println("\nYou've added a side of Spam Musubi to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.SPAMMUSUBI, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 4:
                Spacer.addSpacing();
                System.out.println("\nYou've added a side of Nori to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.NORI, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 5:
                Spacer.addSpacing();
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 6:
                Spacer.addSpacing();
                UserInterface.printDrinkMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getDrinkInput();
                break;
            case 7:
                Spacer.addSpacing();
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                break;
            case 8:
                Spacer.addSpacing();
                currentOrder.printReceipt(currentOrder);
                UserInterface.additionalOrderOptionsMenu();
                Inputs.getAdditionalOrderInput();
                break;
        }
    }

    public static void chooseCombo(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for choosing The Poke Palace today! Have a great day.");
                break;
            case 1:
                Spacer.addSpacing();
                System.out.println("\nYou've chosen the Aloha Combo! Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.ALOHACOMBO, currentOrder);
                EditOrder.addToOrder(MenuAddOns.EDAMAME, currentOrder);
                EditOrder.addToOrder(MenuAddOns.WATER, currentOrder);
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                break;
            case 2:
                Spacer.addSpacing();
                System.out.println("\nYou've chosen the Ono Combo! Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.ONOCOMBO, currentOrder);
                EditOrder.addToOrder(MenuAddOns.CRABBALL, currentOrder);
                EditOrder.addToOrder(MenuAddOns.WATER, currentOrder);
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                break;
            case 3:
                Spacer.addSpacing();
                System.out.println("\nYou've chosen the Ohana Combo! Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.OHANACOMBO, currentOrder);
                EditOrder.addToOrder(MenuAddOns.SPAMMUSUBI, currentOrder);
                EditOrder.addToOrder(MenuAddOns.WATER, currentOrder);
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                break;
            case 4:
                Spacer.addSpacing();
                System.out.println("\nYou've chosen the Mahalo Combo! Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.MAHALOCOMBO, currentOrder);
                EditOrder.addToOrder(MenuAddOns.NORI, currentOrder);
                EditOrder.addToOrder(MenuAddOns.WATER, currentOrder);
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                break;
            case 5:
                Spacer.addSpacing();
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 6:
                Spacer.addSpacing();
                UserInterface.printDrinkMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getDrinkInput();
                break;
            case 7:
                Spacer.addSpacing();
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                break;
            case 8:
                Spacer.addSpacing();
                currentOrder.printReceipt(currentOrder);
                UserInterface.additionalOrderOptionsMenu();
                Inputs.getAdditionalOrderInput();
                break;
        }
    }

    public static void AdditionalOrderOptions(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for choosing The Poke Palace today! Have a great day.");
                break;
            case 1:
                Spacer.addSpacing();
                System.out.println("\nYou've chosen to add an additional order! \n\nUse the menu below to begin placing another order.");
                UserInterface.printEntreeMenu();
                SaveOrder.saveOrder(currentOrder, SaveOrder.getOrderList());
                currentOrder.newOrder(currentOrder);
                break;
            case 2:
                Spacer.addSpacing();
                System.out.println("\nYou've chosen to view previous orders! \n\nUse the menu below to begin placing another order.");
                SaveOrder.saveOrder(currentOrder, SaveOrder.getOrderList());
                OrderHistory.displayPreviousOrders(SaveOrder.getOrderList());
                break;

        }

    }
}
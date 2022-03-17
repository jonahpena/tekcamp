package com.teksystems.bootcamp.capstone2;
import com.teksystems.bootcamp.capstone2.Order.DisplayPreviousOrders;
import com.teksystems.bootcamp.capstone2.Order.EditOrder;
import com.teksystems.bootcamp.capstone2.Order.Orders;
import com.teksystems.bootcamp.capstone2.Order.SaveOrder;
import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;
import com.teksystems.bootcamp.capstone2.UserInputs.Inputs;
import com.teksystems.bootcamp.capstone2.UserInterface.DisplayCurrentOrder;
import com.teksystems.bootcamp.capstone2.UserInterface.UserInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    boolean exit;
    static Orders currentOrder = new Orders();
    static List<Orders> orderList = new ArrayList<>(Arrays.asList(currentOrder));

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
                System.out.println("\nYou've chosen the Aloha Special for 12.99.");
                EditOrder.addToOrder(MenuAddOns.ALOHA, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 2:
                System.out.println("\nYou've chosen the Ono Special for 12.99.");
                EditOrder.addToOrder(MenuAddOns.ONO, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 3:
                System.out.println("\nYou've chosen the Ohana Special for 12.99.");
                EditOrder.addToOrder(MenuAddOns.OHANA, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 4:
                System.out.println("\nYou've chosen the Mahalo Special for 12.99.");
                EditOrder.addToOrder(MenuAddOns.MAHALO, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 5:
                UserInterface.printDrinkMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getDrinkInput();
                break;
            case 6:
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;

        }
    }

    public static void chooseTopping(int choice) {
        boolean exit;
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for choosing The Poke Palace today! Have a great day.");
                break;
            case 1:
                System.out.println("\nYou've added Furikake to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.FURIKAKE, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 2:
                System.out.println("\nYou've added Ginger to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.GINGER, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 3:
                System.out.println("\nYou've added Masago to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.MASAGO, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 4:
                System.out.println("\nYou've added Wasabi to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.WASABI, currentOrder);
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 5:
                UserInterface.printDrinkMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getDrinkInput();
                break;
            case 6:
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 7:
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                break;
            case 8:
                currentOrder.printReceipt(currentOrder);
                UserInterface.additionalOrderOptionsMenu();
                Inputs.getAdditionalOrderInput();
                break;
        }
    }

    public static void chooseDrink(int choice) {
        boolean exit;
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for choosing The Poke Palace today! Have a great day.");
                break;
            case 1:
                System.out.println("\nYou've added a Sprite to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.SPRITE, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 2:
                System.out.println("\nYou've added a Coke to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.COKE, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 3:
                System.out.println("\nYou've added a Root-Beer to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.ROOTBEER, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 4:
                System.out.println("\nYou've added a Water to your meal. Use the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.WATER, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 5:
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 6:
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 7:
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                ;
                break;
            case 8:
                currentOrder.printReceipt(currentOrder);
                UserInterface.additionalOrderOptionsMenu();
                Inputs.getAdditionalOrderInput();
                break;
        }
    }

    public static void chooseSide(int choice) {
        boolean exit;
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for choosing The Poke Palace today! Have a great day.");
                break;
            case 1:
                System.out.println("\nYou've added a side of Edamame to your meal. \nUse the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.EDAMAME, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 2:
                System.out.println("\nYou've added a Crab ball to your meal. \nUse the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.CRABBALL, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 3:
                System.out.println("\nYou've added a side of Spam Musubi to your meal. \nUse the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.SPAMMUSUBI, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 4:
                System.out.println("\nYou've added a side of Nori to your meal. \nUse the menu below to continue with your order.");
                EditOrder.addToOrder(MenuAddOns.NORI, currentOrder);
                UserInterface.printSideMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getSideInput();
                break;
            case 5:
                UserInterface.printToppingMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getToppingInput();
                break;
            case 6:
                UserInterface.printDrinkMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                Inputs.getDrinkInput();
                break;
            case 7:
                UserInterface.printEntreeMenu();
                DisplayCurrentOrder.displayCurrentOrder(currentOrder);
                break;
            case 8:
                currentOrder.printReceipt(currentOrder);
                UserInterface.additionalOrderOptionsMenu();
                Inputs.getAdditionalOrderInput();
                break;
        }
    }

    public static void AdditionalOrderOptions(int choice) {
        boolean exit;
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for choosing The Poke Palace today! Have a great day.");

                break;
            case 1:
                System.out.println("\nYou've chosen to add an additional order! \n\nUse the menu below to begin placing another order.");
                UserInterface.printEntreeMenu();
                SaveOrder.saveOrder(currentOrder, orderList);
                currentOrder.newOrder(currentOrder);
                break;
            case 2:
                System.out.println("\nYou've chosen to view previous orders! \n\nUse the menu below to begin placing another order.");
                SaveOrder.saveOrder(currentOrder, orderList);
                DisplayPreviousOrders.displayPreviousOrders(orderList);
                break;

        }

    }

    public static List<Orders> getOrderList() {
        return orderList;
    }

    public static void setOrderList(List<Orders> orderList) {
        Menu.orderList = orderList;
    }

}
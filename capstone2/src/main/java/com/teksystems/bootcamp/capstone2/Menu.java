package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.Items.Entree;

public class Menu {
    boolean exit;

    public void generateWelcome() {
        UserInterface.printWelcome();
        UserInterface.printMenu();
        while (!exit) {
            int choice = Input.getFirstInput();
            chooseMenuItem(choice);

        }
    }

    private void chooseMenuItem(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("\nThank you for using our application! Have a great day.");
                break;
            case 1:
                System.out.println("\nYou've chosen the Aloha Special for 12.99. \nWould you like to add another item?\n\nInput 1 for Yes\nInput 2 to complete your order");
                EditOrder.addToOrder();
                Input.getSecondInput();
                break;
            case 2:
                System.out.println("\nYou've chosen the Ono Special for 12.99. \nWould you like to add another item?\n\nInput 1 for Yes\nInput 2 to complete your order");
                Input.getSecondInput();
                break;
            case 3:
                System.out.println("\nYou've chosen the Ohana Special for 12.99. \nWould you like to add another item?\n\nInput 1 for Yes\nInput 2 to complete your order");
                Input.getSecondInput();
                break;
            case 4:
                System.out.println("\nYou've chosen the Mahalo Special for 12.99. \nWould you like to add another item?\n\nInput 1 for Yes\nInput 2 to complete your order");
                Input.getSecondInput();
                break;
        }
    }


    static void addItemOrCompleteOrder(int secondChoice) {
        boolean exit;
        switch (secondChoice) {
            case 0:
                exit = true;
                System.out.println("\nThanks for visiting the Poke Palace! We hope to see you again soon!");
                break;
            case 1:
                System.out.println("\nYou've chosen to add another item. Make your selection with the Menu below:");
                UserInterface.printMenu();
                break;
            case 2:
                exit = true;
                System.out.println("\nOrder Complete. Find your reciept below");
                Receipt.printReceipt();
                break;

        }
    }

}
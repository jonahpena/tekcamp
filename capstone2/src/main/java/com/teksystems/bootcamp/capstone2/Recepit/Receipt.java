package com.teksystems.bootcamp.capstone2.Recepit;


public class Receipt {

    static int orderNumber = 1;

    public static void printReceipt(){

//        ReceiptValues.displaySelectedMenuItemPrice();
        System.out.println("\n+-----------------------------+");
        System.out.println("|          Order#: " + orderNumber + "          |");
        System.out.println("|                             |");
        ReceiptValues.displaySelectedMenuItemNames();
        System.out.println("|                             |");
        System.out.println("|                             |");
        ReceiptValues.displaySumOfOrder();
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");

    }
}

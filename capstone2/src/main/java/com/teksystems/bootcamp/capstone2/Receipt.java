package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.EditOrder.ReceiptValues;

public class Receipt {

    static int orderNumber = 1;

    public static void printReceipt(){
//        String menuItemNames = ReceiptValues.displaySelectedMenuItemNames();
        ReceiptValues.displaySelectedMenuItemPrice();
        ReceiptValues.displaySumOfOrder();

        System.out.println("\n+-----------------------------+");
        System.out.println("|     Order#: " + orderNumber + "           |");
        System.out.println("|                             |");
        System.out.println("|                             |");

        System.out.println("|                             |");
        System.out.println("|                             |");
        System.out.println("| " + "                       |");

        System.out.println("|                             |");
        System.out.println("+-----------------------------+");

    }
}

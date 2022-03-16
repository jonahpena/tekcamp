package com.teksystems.bootcamp.capstone2.Recepit;


public class Receipt {

    static int orderNumber = 236847;

    public static void printReceipt(){
        System.out.println("\n+-----------------------------+");
        System.out.println("|     Jonah's Poke Palace     |");
        System.out.println("|       Order#:" + orderNumber + "         |");
        System.out.println("|                             |");
        ReceiptValues.displaySelectedMenuItemNames();
        System.out.println("|                             |");
        ReceiptValues.displaySubtotalOfOrder();
        System.out.println("|                             |");
        ReceiptValues.displayTaxOfOrder();
        ReceiptValues.displaySumOfOrder();
        System.out.println("|                             |");
        System.out.println("+-----------------------------+");
    }
}
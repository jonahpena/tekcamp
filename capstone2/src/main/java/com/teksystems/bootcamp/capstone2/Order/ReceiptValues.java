package com.teksystems.bootcamp.capstone2.Order;

import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;
import com.teksystems.bootcamp.capstone2.TaxCalculator;

import java.util.ArrayList;
import java.util.List;

public class ReceiptValues {

    public static void displaySumOfOrder(Orders order) {
        double sum = order.getSum();
        double taxedSum = TaxCalculator.calculateTax(sum);
        double taxedTotal = sum + taxedSum;


        double roundedSum = Math.round(taxedTotal*100.0)/100.0;


        System.out.println("|  Total: $" + roundedSum + "              |");
    }

    public static void displayCurrentSubtotalOfOrder(Orders order) {
        double sum = order.getSum();
        double roundedSum = Math.round(sum*100.0)/100.0;
        System.out.println("|  Subtotal: $" + roundedSum + "           |");
    }

    public static void displayTaxOfOrder(Orders order) {
        double sum = order.getSum();

        double taxedSum = TaxCalculator.calculateTax(sum);
        double roundedSum = Math.round(taxedSum*100.0)/100.0;
        System.out.println("|  Tax:   $" + roundedSum  + "               |");
    }

    public static void displaySelectedMenuItemNames(Orders order) {
        List<String> menuItemNames = new ArrayList<>();
        for (MenuAddOns item : order.getEntrees()) {
            menuItemNames.add(item.getName());
        }
        for (String item : menuItemNames) { System.out.println("|  " + item); }
    }
}
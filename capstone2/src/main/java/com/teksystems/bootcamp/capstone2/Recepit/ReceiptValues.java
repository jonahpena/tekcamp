package com.teksystems.bootcamp.capstone2.Recepit;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

import java.util.ArrayList;
import java.util.List;

public class ReceiptValues {

    public static void displaySumOfOrder() {
        List<MenuAddOns> entreeList;
        entreeList = EditOrder.getEntreeList();
        double sum = 0;

        List<Double> menuItemPrice = new ArrayList<>();

        for (MenuAddOns item : entreeList) {
            sum += item.getCost();
            menuItemPrice.add(item.getCost());
        }
        double taxedSum = 1.07 * sum;
        double roundedSum = Math.round(taxedSum*100.0)/100.0;


//        System.out.println("|  Tax: $" + taxedSum);
        System.out.println("|  Total: $" + roundedSum);
    }

    public static void displaySelectedMenuItemNames() {
        List<MenuAddOns> entreeList;
        entreeList = EditOrder.getEntreeList();
        List<String> menuItemNames = new ArrayList<>();
        for (MenuAddOns item : entreeList) {
            menuItemNames.add(item.getName());
        }
        for (String item : menuItemNames) { System.out.println("|  " + item); }
    }
}

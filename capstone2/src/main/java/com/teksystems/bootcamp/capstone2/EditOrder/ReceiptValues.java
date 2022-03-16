package com.teksystems.bootcamp.capstone2.EditOrder;

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
        System.out.println("Total: " + sum);
    }

    public static void displaySelectedMenuItemNames() {
        List<MenuAddOns> entreeList;
        entreeList = EditOrder.getEntreeList();
        List<String> menuItemNames = new ArrayList<>();
        for (MenuAddOns itemName : entreeList) {
            menuItemNames.add(itemName.getName());
        }
        for (MenuAddOns itemPrice : entreeList) {
            menuItemNames.add(itemPrice.getName());
        }

        for (String item : menuItemNames) { System.out.println("|  " + item +"----"); }
    }

    public static void displaySelectedMenuItemPrice() {
        List<MenuAddOns> entreeList;
        entreeList = EditOrder.getEntreeList();
        List<Double> menuItemPrice = new ArrayList<>();
        for (MenuAddOns item : entreeList) {
            menuItemPrice.add(item.getCost());
        }
        for (Double item : menuItemPrice) { System.out.println("----" + item); }
    }
}
//package com.teksystems.bootcamp.capstone2.EditOrder;
//
//import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CalculateOrderTotal {
//
//    public static void sumOfOrder() {
//        List<MenuAddOns> entreeList;
//        entreeList = EditOrder.getEntreeList();
//        double sum = 0;
//
//        List<String> menuItemNames = new ArrayList<>();
//        List<Double> menuItemPrice = new ArrayList<>();
//
//
//        for (MenuAddOns item : entreeList) {
//            sum += item.getCost();
//            menuItemNames.add(item.getName());
//            menuItemPrice.add(item.getCost());
//        }
//        System.out.println(menuItemNames);
//        System.out.println(menuItemPrice);
//        System.out.println("Total: " + sum);
//    }
//
//
//
//    public static void displayMenuItems() {
//        List<MenuAddOns> entreeList;
//        entreeList = EditOrder.getEntreeList();
//        List<String> menuItemNames = new ArrayList<>();
//
//
//        for (MenuAddOns item : entreeList) {
//            menuItemNames.add(item.getName());
//        }
//        System.out.println(menuItemNames);
//
//
//    }
//
//}

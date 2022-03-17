package com.teksystems.bootcamp.capstone2.UserInterface;

import com.teksystems.bootcamp.capstone2.Order.Orders;

public class DisplayCurrentOrder {
    public static void displayCurrentOrder(Orders order) {
        double sum = order.getSum();
        double roundedSum = Math.round(sum*100.0)/100.0;
        System.out.println("\nCurrent Order Items: " + order.getEntrees());
        System.out.println("Current Subtotal: $" + roundedSum);
    }
}

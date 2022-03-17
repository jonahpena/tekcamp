package com.teksystems.bootcamp.capstone2.UserInterface;

import com.teksystems.bootcamp.capstone2.Order.Orders;


public class DisplayCurrentOrder {
    public static void displayCurrentOrder(Orders order) {
        System.out.println("\nCurrent Order Items: " + order.getEntrees());
        System.out.println("\nCurrent Subtotal: " + order.getSum());
    }
}

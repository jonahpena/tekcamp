package com.teksystems.bootcamp.capstone2.UserInterface;

import com.teksystems.bootcamp.capstone2.Order.Orders;

import java.util.List;

public class OrderHistory {
    public static void displayPreviousOrders(List<Orders> orderList) {
        for (Orders order : orderList
        ) {
            order.printReceipt(order);
        }
    }
}
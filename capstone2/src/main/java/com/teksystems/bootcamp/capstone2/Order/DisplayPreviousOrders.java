package com.teksystems.bootcamp.capstone2.Order;

import java.util.List;

public class DisplayPreviousOrders {
    public static void displayPreviousOrders(List<Orders> orderList) {
        for (Orders order: orderList
             ) {order.printReceipt(order);
        }
    }
}

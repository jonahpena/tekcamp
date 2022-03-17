package com.teksystems.bootcamp.capstone2.Order;

import java.util.List;

public class SaveOrder {
    public static void saveOrder(Orders order, List<Orders> orderList) {
        orderList.add(order);
    }
}
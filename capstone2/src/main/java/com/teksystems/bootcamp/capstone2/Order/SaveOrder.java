package com.teksystems.bootcamp.capstone2.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.teksystems.bootcamp.capstone2.Menu.Menu.currentOrder;

public class SaveOrder {

    static List<Orders> orderList = new ArrayList<>(Arrays.asList(currentOrder));

    public static void saveOrder(Orders order, List<Orders> orderList) {
        orderList.add(order);
    }

    public static List<Orders> getOrderList() {
        return orderList;
    }
}
package com.teksystems.bootcamp.capstone2.EditOrder;

import java.util.ArrayList;
import java.util.List;

public class SaveOrder {
    public static void saveOrder(Orders order, List<Orders> orderList) {
        orderList.add(order);
    }
}

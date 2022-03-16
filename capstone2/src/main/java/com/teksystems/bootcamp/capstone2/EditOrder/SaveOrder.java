package com.teksystems.bootcamp.capstone2.EditOrder;

import java.util.ArrayList;
import java.util.List;

public class SaveOrder {
    private List<Orders> orders = new ArrayList<>();

    public SaveOrder(List<Orders> orders) {
        this.orders = orders;
    }
    public void saveOrder(Orders order) {
        this.orders.add(order);
    }
}

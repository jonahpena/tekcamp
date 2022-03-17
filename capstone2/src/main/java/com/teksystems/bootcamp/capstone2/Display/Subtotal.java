package com.teksystems.bootcamp.capstone2.Display;

import com.teksystems.bootcamp.capstone2.Order.Orders;

public class Subtotal implements Display {

    @Override
    public void generate(Orders order) {
        double sum = order.getSum();
        double roundedSum = Math.round(sum * 100.0) / 100.0;
        System.out.println("|  Subtotal: $" + roundedSum + "           |");
    }
}

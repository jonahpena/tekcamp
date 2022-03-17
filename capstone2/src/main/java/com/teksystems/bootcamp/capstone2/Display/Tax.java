package com.teksystems.bootcamp.capstone2.Display;

import com.teksystems.bootcamp.capstone2.Order.Orders;
import com.teksystems.bootcamp.capstone2.Logic.TaxCalculator;

public class Tax implements Display{
    @Override
    public void generate(Orders order) {
        double sum = order.getSum();
        double taxedSum = TaxCalculator.calculateTax(sum);
        System.out.println("|  Tax:   $" + taxedSum  + "               |");

    }
}

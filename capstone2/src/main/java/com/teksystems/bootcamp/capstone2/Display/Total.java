package com.teksystems.bootcamp.capstone2.Display;

import com.teksystems.bootcamp.capstone2.Order.Orders;
import com.teksystems.bootcamp.capstone2.Utility.TaxCalculator;

public class Total implements Display {
    @Override
    public void generate(Orders order) {
            double sum = order.getSum();
            double taxedSum = TaxCalculator.calculateTax(sum);
            double taxedTotal = sum + taxedSum;
            double roundedSum = Math.round(taxedTotal*100.0)/100.0;

            System.out.println("|  Total: $" + roundedSum + "              |");
    }
}

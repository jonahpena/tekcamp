package com.teksystems.bootcamp.capstone2.Utility;

public class TaxCalculator {

    public static double calculateTax(double input) {
        double taxedSum = (0.0625 * input);
        double roundedSum = Math.round(taxedSum*100.0)/100.0;
        return roundedSum;
    }
}

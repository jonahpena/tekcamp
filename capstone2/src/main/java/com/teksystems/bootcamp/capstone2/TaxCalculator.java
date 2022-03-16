package com.teksystems.bootcamp.capstone2;

public class TaxCalculator {

    public static double calculateTax(double input) {
        double taxedSum = (1.0625 * input) - input;

        return taxedSum;
    }

}

package com.teksystems.bootcamp.capstone2;

import java.text.NumberFormat;
import java.util.Locale;

public class TaxCalculator {

    public static String calculateTotalPrice(double addOns) {
        double addNumber = 0;
        double basePrice = 0.00;
        double taxPrice = 0.07;

        addNumber += addOns + basePrice;

        double totalPrice = addNumber + addNumber * taxPrice;

        NumberFormat formatPrice = NumberFormat.getCurrencyInstance(Locale.US);

        String doubleFormatted = formatPrice.format(totalPrice);

        return "Thank you for your order! The total cost is: " + doubleFormatted;
    }

}

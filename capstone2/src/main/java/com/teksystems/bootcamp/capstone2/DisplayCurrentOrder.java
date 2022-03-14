package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;

public class DisplayCurrentOrder {

    public static void displayCurrentOrder() {
        System.out.println("Current Order: " + EditOrder.getEntreeList());
    }
}

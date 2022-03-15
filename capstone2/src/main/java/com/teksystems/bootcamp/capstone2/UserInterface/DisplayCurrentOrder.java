package com.teksystems.bootcamp.capstone2.UserInterface;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.ActualEntree;

public class DisplayCurrentOrder {

    public static void displayCurrentOrder() {
        System.out.println("\nCurrent Order: " + EditOrder.getEntreeList());
        System.out.println("\nCurrent Entree: " + ActualEntree.getName());
//        for (ActualEntree entree: ActualEntree.getValue()) {
//            System.out.println("\nCurrent Entree: " + 1);
//        }


    }
}

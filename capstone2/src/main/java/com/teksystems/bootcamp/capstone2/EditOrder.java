package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.Items.Entree;

import java.util.ArrayList;
import java.util.List;

public class EditOrder {
    public static boolean addToOrder() {
        System.out.println("Add Enum values to ArrayList:");
        List<Entree> entreeList = new ArrayList<>();


        entreeList.add(Entree.ONO);
        entreeList.add(Entree.ONO);
        entreeList.add(Entree.ALOHA);

        System.out.println(entreeList);


//        for (Entree singleEntree : entreeList) {
//            System.out.println(entreeList);
//        }

        return false;
    }
    public static void removeFromOrder() {

    }
}

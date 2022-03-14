package com.teksystems.bootcamp.capstone2.EditOrder.AddSide;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.Entree;

public class AddNori extends EditOrder {
    public static void addToOrder() {
        entreeList.add(Entree.NORI);
    }
}

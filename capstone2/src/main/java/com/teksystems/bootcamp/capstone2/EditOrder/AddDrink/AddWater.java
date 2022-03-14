package com.teksystems.bootcamp.capstone2.EditOrder.AddDrink;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.Entree;

public class AddWater extends EditOrder {
    public static void addToOrder() {
        entreeList.add(Entree.WATER);
    }
}

package com.teksystems.bootcamp.capstone2.EditOrder.AddTopping;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.Entree;

public class AddMasagoTopping extends EditOrder {
    public static void addToOrder() {
        entreeList.add(Entree.MASAGO);
    }
}

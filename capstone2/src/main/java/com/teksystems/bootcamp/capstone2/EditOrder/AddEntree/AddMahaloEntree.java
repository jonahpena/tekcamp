package com.teksystems.bootcamp.capstone2.EditOrder.AddEntree;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.Entree;

public class AddMahaloEntree extends EditOrder {
    public static void addToOrder() {
        entreeList.add(Entree.MAHALO);
    }
}

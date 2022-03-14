package com.teksystems.bootcamp.capstone2.EditOrder.RemoveEntree;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.Entree;

public class RemoveAlohaEntree extends EditOrder {
    public static void removeFromOrder() {
        entreeList.remove(Entree.ALOHA);
    }
}

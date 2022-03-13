package com.teksystems.bootcamp.capstone2.EditOrder;

import com.teksystems.bootcamp.capstone2.Items.Entree;

public class RemoveAlohaEntree extends EditOrder {
    public static void removeFromOrder() {
        entreeList.remove(Entree.ALOHA);
    }
}

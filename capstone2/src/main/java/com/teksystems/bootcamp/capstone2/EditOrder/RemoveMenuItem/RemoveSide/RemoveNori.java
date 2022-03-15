package com.teksystems.bootcamp.capstone2.EditOrder.RemoveMenuItem.RemoveSide;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

public class RemoveNori extends EditOrder {
    public static void removeFromOrder() {
        entreeList.remove(MenuAddOns.NORI);
    }
}
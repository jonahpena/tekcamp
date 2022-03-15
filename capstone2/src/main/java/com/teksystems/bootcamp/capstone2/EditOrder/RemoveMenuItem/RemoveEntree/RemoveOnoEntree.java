package com.teksystems.bootcamp.capstone2.EditOrder.RemoveMenuItem.RemoveEntree;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

public class RemoveOnoEntree extends EditOrder {
    public static void removeFromOrder() {
        entreeList.remove(MenuAddOns.ONO);
    }
}

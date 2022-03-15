package com.teksystems.bootcamp.capstone2.EditOrder.RemoveMenuItem.RemoveSide;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

public class RemoveEdamame extends EditOrder {
    public static void removeFromOrder() {
        entreeList.remove(MenuAddOns.EDAMAME);
    }
}

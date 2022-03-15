package com.teksystems.bootcamp.capstone2.EditOrder.RemoveMenuItem.RemoveDrink;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

public class RemoveCoke extends EditOrder {
    public static void addToOrder() {
        entreeList.remove(MenuAddOns.COKE);
    }
}

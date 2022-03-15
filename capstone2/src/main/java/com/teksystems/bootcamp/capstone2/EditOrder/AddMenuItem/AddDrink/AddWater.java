package com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddDrink;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

public class AddWater extends EditOrder {
    public static void addToOrder() {
        entreeList.add(MenuAddOns.WATER);
    }
}

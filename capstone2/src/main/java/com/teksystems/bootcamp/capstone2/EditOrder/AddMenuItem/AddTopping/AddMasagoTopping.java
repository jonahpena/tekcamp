package com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddTopping;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

public class AddMasagoTopping extends EditOrder {
    public static void addToOrder() {
        entreeList.add(MenuAddOns.MASAGO);
    }
}
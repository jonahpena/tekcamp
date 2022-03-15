package com.teksystems.bootcamp.capstone2.EditOrder.AddMenuItem.AddEntree;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

public class AddAlohaEntree extends EditOrder {
    public static void addToOrder() {
        entreeList.add(MenuAddOns.ALOHA);
    }
}
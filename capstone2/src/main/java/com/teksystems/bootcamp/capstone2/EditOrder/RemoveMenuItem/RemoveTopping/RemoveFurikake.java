package com.teksystems.bootcamp.capstone2.EditOrder.RemoveMenuItem.RemoveTopping;

import com.teksystems.bootcamp.capstone2.EditOrder.EditOrder;
import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

public class RemoveFurikake extends EditOrder {
    public static void removeFromOrder() {
        entreeList.remove(MenuAddOns.FURIKAKE);
    }
}

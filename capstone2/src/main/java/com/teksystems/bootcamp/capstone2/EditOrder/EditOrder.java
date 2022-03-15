package com.teksystems.bootcamp.capstone2.EditOrder;

import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

import java.util.ArrayList;
import java.util.List;

public abstract class EditOrder {
    public static List<MenuAddOns> entreeList = new ArrayList<>();

    public static void setEntreeList(List<MenuAddOns> entreeList) {
        EditOrder.entreeList = entreeList;
    }

    public static List<MenuAddOns> getEntreeList() {
        return entreeList;
    }
}


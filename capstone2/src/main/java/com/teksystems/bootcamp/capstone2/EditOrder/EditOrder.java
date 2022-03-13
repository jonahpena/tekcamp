package com.teksystems.bootcamp.capstone2.EditOrder;

import com.teksystems.bootcamp.capstone2.Items.Entree;

import java.util.ArrayList;
import java.util.List;

public abstract class EditOrder {
    public static List<Entree> entreeList = new ArrayList<>();

    public static void setEntreeList(List<Entree> entreeList) {
        EditOrder.entreeList = entreeList;
    }

    public static List<Entree> getEntreeList() {
        return entreeList;
    }
}


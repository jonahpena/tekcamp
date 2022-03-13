package com.teksystems.bootcamp.capstone2.EditOrder;

import com.teksystems.bootcamp.capstone2.Items.Entree;

import java.util.ArrayList;
import java.util.List;

public class AddAlohaEntree extends EditOrder {
    public static void addToOrder() {
        entreeList.add(Entree.ALOHA);
    }
}

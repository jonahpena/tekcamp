package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.Items.Entree;

import java.util.ArrayList;

public class Order<MenuItemEnum> {
    ArrayList<MenuItemEnum> menuItem = new ArrayList<>();

    public ArrayList<MenuItemEnum> getMenuItem() {
    Entree.ALOHA.getCost();

        return menuItem;
    }
}

package com.teksystems.bootcamp.capstone2.EditOrder;

import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

import java.util.ArrayList;
import java.util.List;

public abstract class EditOrder {
    public static void addToOrder(MenuAddOns item, Orders order){
        Double itemCost = item.getCost();
        order.addToEntrees(item, order);
        order.setSum(order.getSum() + itemCost);
    }

    public static void removeFromOrder(MenuAddOns item, Orders order){
        Double itemCost = item.getCost();
        order.removeFromEntrees(item, order);
        order.setSum(order.getSum() - itemCost);
    }
}


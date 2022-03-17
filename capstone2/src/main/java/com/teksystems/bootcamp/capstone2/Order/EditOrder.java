package com.teksystems.bootcamp.capstone2.Order;

import com.teksystems.bootcamp.capstone2.Items.MenuAddOns;

public class EditOrder {
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


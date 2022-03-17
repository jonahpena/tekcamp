package com.teksystems.bootcamp.capstone2.Display;

import com.teksystems.bootcamp.capstone2.Menu.MenuAddOns;
import com.teksystems.bootcamp.capstone2.Order.Orders;

import java.util.ArrayList;
import java.util.List;

public class Items implements Display{
    @Override
    public void generate(Orders order) {
        List<String> menuItemNames = new ArrayList<>();
        for (MenuAddOns item : order.getEntrees()) {
            menuItemNames.add(item.getName());
        }
        for (String item : menuItemNames) { System.out.println("|  " + item); }

    }
}

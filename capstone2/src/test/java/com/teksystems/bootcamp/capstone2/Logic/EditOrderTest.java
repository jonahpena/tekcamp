package com.teksystems.bootcamp.capstone2.Logic;

import com.teksystems.bootcamp.capstone2.Logic.MenuAddOns;
import com.teksystems.bootcamp.capstone2.Logic.EditOrder;
import com.teksystems.bootcamp.capstone2.Order.Orders;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class EditOrderTest {
    @Test
    public void addToOrderTest(){
        Orders order = new Orders();
        EditOrder.addToOrder(MenuAddOns.OHANA, order);

        List<MenuAddOns> expected = Collections.singletonList(MenuAddOns.OHANA);
        List<MenuAddOns> actual = order.getEntrees();

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void RemoveFromOrderTest(){
        Orders order = new Orders();
        List<MenuAddOns> orderList = order.getEntrees();

        boolean isEmpty = false;
        EditOrder.addToOrder(MenuAddOns.OHANA, order);
        EditOrder.removeFromOrder(MenuAddOns.OHANA, order);

        if (orderList.size() == 0){
            isEmpty = true;
        }

        boolean expected = true;
        boolean actual = isEmpty;

        Assert.assertEquals(actual, expected);
    }
}
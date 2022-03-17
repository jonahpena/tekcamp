package com.teksystems.bootcamp.capstone2.EditOrder;

import com.teksystems.bootcamp.capstone2.Order.Orders;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTest {
    Orders order = new Orders();

    @Test
    public void totalOfOrder(){
        double actual = order.getSum();
        double expected = 0;
        Assert.assertEquals(actual,expected);
    }
}
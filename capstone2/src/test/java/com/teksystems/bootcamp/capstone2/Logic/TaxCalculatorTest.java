package com.teksystems.bootcamp.capstone2.Logic;

import com.teksystems.bootcamp.capstone2.Logic.TaxCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaxCalculatorTest {
    @Test
    public void taxTest() {
        double actual = TaxCalculator.calculateTax(12.99);
        double expected = 0.81;

        Assert.assertEquals(actual,expected);

    }
}

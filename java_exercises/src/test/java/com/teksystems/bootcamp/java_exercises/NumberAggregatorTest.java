package com.teksystems.bootcamp.java_exercises;

import com.teksystems.bootcamp.java_exercises.additionalInputs.NumberAggregator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberAggregatorTest {
    @Test
    public void TwoPlusTwoShouldEqualFour(){
        //arrange

        int actual;
        int expected = 4;

        NumberAggregator aggregator = new NumberAggregator(2);

        // act
        actual = aggregator.addNumber(2);

        // assert
        Assert.assertEquals(actual, expected);
    }
}

package com.teksystems.bootcamp.java_exercises;

import com.teksystems.bootcamp.java_exercises.additionalInputs.NumberAggregator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberAggregatorTest {
    @Test
    public void TwoPlusTwoShouldEqualFour(){
        //arrange
        NumberAggregator aggregator = new NumberAggregator(0);

        int actual;
        int expected = 4;

        // act
        aggregator.addNumber(2);
        actual = aggregator.addNumber(2);

        // assert
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TwoPlusFiveShouldEqualSeven(){
        //arrange
        NumberAggregator aggregator = new NumberAggregator(0);

        int actual;
        int expected = 7;

        // act
        aggregator.addNumber(2);
        actual = aggregator.addNumber(5);

        // assert
        Assert.assertEquals(actual, expected);
    }
}

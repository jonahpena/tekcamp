package com.teksystems.bootcamp.java_exercises;

import com.teksystems.bootcamp.java_exercises.additionalInputs.NumberAggregator;
import com.teksystems.bootcamp.java_exercises.factorByTwo.Node;
import com.teksystems.bootcamp.java_exercises.factorByTwo.NodeCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NodeCreatorTest {
    @Test
    public void getCountOfTwosShouldReturnOne(){
        //arrange
        Node actual;
        int expected = 1;

        // act

        actual = NodeCreator.createNode(2);
        actual.getCountOfTwos();

        // assert
        Assert.assertEquals(actual, expected);
    }
}

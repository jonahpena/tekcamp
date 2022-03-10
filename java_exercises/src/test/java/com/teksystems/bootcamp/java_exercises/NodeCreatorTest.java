package com.teksystems.bootcamp.java_exercises;
import com.teksystems.bootcamp.java_exercises.factorByTwo.Node;
import com.teksystems.bootcamp.java_exercises.factorByTwo.NodeCreator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NodeCreatorTest {
    @Test
    public void getCountOfTwosShouldReturnSix(){
        Node abram = NodeCreator.createNode(64);
        int actual = abram.getCountOfTwos();
        int expected = 6;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void getCountOfTwosShouldReturnTen(){
        Node abram = NodeCreator.createNode(1024);
        int actual = abram.getCountOfTwos();
        int expected = 10;
        Assert.assertEquals(actual, expected);
    }
}

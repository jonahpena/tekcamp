package com.teksystems.bootcamp.java_exercises;
import com.teksystems.bootcamp.java_exercises.factorByTwo.Node;
import com.teksystems.bootcamp.java_exercises.factorByTwo.NodeCreator;
import com.teksystems.bootcamp.java_exercises.factorByTwo.ValueNode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NodeCreatorTest {
    @Test
    public void createNodeShouldReturnOne(){
        //arrange
        Node expected = new ValueNode(1);
        Node actual;

        // act

        actual = NodeCreator.createNode(2);
        actual.getCountOfTwos();

        // assert
        Assert.assertEquals(actual, expected);
    }
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

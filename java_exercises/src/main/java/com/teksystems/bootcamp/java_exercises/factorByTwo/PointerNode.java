package com.teksystems.bootcamp.java_exercises.factorByTwo;

public class PointerNode extends Node{

    private Node nodeOne;
    private Node nodeTwo;

    public PointerNode(Node nodeOne, Node nodeTwo) {

        this.nodeOne = nodeOne;
        this.nodeTwo = nodeTwo;
    }

    public int getCountOfTwos() {
        int sum = nodeOne.getCountOfTwos() + nodeTwo.getCountOfTwos();

        return sum;
    }

}

//PointerNode extends Node
    //public constructor
        //takes two nodes
    //public int getCountOfTwos();
        //returns sum of getCountOfTwo() from both Nodes

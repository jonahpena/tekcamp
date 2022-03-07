package com.teksystems.bootcamp.java_exercises.factorByTwo;

public class ValueNode extends Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    int getCountOfTwos() {
        if (value == 2) {
            return 1;
        } else {
            return 0;
        }
    }
}

//ValueNode (extends Node)
    //public constructor
        //take an int
    //public int getCountOfTwos();
        //returns 1 if the value is 2,else 0
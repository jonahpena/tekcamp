package com.teksystems.bootcamp.java_exercises.factorByTwo;

public class NodeCreator {

    public static Node createNode(int number) {

        if (number == 2 || number % 2 != 0) {

            return new ValueNode(number);

        } else {

            return new PointerNode(createNode(2), createNode(number /2));
        }

    }
}

//NodeCreator
    //public static Node createNode(int number);
        //return a ValueNode if the number is 2 or not divisible by 2
        //return a PointerNode and uses createNode() to generate the constructor arguments
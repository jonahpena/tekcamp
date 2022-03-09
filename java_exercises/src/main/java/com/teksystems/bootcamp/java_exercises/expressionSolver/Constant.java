package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class Constant extends Term{
private double finalValue;

    public Constant(double finalValue) {
        this.finalValue = finalValue;
    }


    @Override
    public double getValue() {
        return 0;
    }
}

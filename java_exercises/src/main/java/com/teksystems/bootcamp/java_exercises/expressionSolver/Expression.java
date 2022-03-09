package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class Expression extends Term {
    private Term firstTerm;
    private Term secondTerm;
    private Operation operation;

    public Expression(Term firstTerm, Term secondTerm, Operation operation) {
        this.firstTerm = firstTerm;
        this.secondTerm = secondTerm;
        this.operation = operation;
    }

    @Override
    public double getValue() {
        return 0;
    }
}

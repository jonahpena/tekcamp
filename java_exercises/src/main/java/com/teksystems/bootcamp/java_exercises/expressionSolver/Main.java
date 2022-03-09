package com.teksystems.bootcamp.java_exercises.expressionSolver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpressionParser givenExpression = new ExpressionParser();
        System.out.println("Enter an equation: ");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String mathExpression = scanner.nextLine();

            mathExpression = mathExpression.replaceAll(" ", "");

            Term term = expression.parseExpression(mathExpression);

            System.out.println("Solving " + mathExpression + "... " + "The solution is: " + term.getValue());

            System.out.println("Enter an expression: ");

        }
    }
}

package com.teksystems.bootcamp.java_exercises.expressionSolver;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input an expression to be solved: ");
    String expression = scanner.next();
    Term term = ExpressionParser.parseExpression(expression);
    System.out.println("End Value: "+term.getValue());
  }
}

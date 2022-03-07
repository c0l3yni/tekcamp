package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class ExpressionParser {
  public static Term parseExpression(String input) {
    Double d;

    try {
      d = Double.parseDouble(input);
    } catch (Exception e) {
      d = null;
    }
    if (d != null) {
      return new Constant(d);
    }
    String term1;
    String term2;

    int i;
    Operation operation = null;
    for (i = input.length() - 1; i >= 0; i--) {
      if (input.charAt(i) == '+' || input.charAt(i) == '-') {
        if (input.charAt(i) == '+') {
          operation = new AdditionOperation();
        } else {
          operation = new SubtractionOperation();
        }
        break;
      }
    }
    if (operation == null) {
      for (i = input.length() - 1; i >= 0; i--) {
        if (input.charAt(i) == '*' || input.charAt(i) == '/' || input.charAt(i) == '%') {
          if (input.charAt(i) == '*') {
            operation = new MultiplicationOperation();
          } else if (input.charAt(i) == '/') {
            operation = new DivisionOperation();
          } else if (input.charAt(i) == '%') {
            operation = new ModuloOperation();
          }
          break;
        }
      }
    }
    if (operation == null) {
      for (i = input.length() - 1; i >= 0; i--) {
        if (input.charAt(i) == '^') {
          if (input.charAt(i) == '^') {
            operation = new ExponentOperation();
            break;
          }
        }
      }
    }
    term1 = input.substring(0, i);
    term2 = input.substring(i + 1);
    return new Expression(parseExpression(term1), operation, parseExpression(term2));
  }
}
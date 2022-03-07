package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class DivisionOperation extends Operation {
  @Override
  public double calculate(double val1, double val2) {
    if (val2 != 0) {
      return val1 / val2;
    } else {
      System.out.println("invalid, cannot divide by 0");
    }
    return val1;
  }

  @Override
  public String getValue() {
    return "/";
  }
}

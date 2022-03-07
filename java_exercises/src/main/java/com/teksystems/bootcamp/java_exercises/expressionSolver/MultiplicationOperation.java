package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class MultiplicationOperation extends Operation{
  @Override
  public double calculate(double val1, double val2) {
    return val1 * val2;
  }

  @Override
  public String getValue() {
    return "*";
  }

}

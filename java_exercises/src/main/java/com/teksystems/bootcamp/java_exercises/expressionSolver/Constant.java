package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class Constant extends Term{

  private double constVal;

  public Constant(double numVal) {
    this.constVal = numVal;
  }

  public Constant() {

  }

  @Override
  public double getValue() {
    return constVal;
  }
}

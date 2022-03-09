package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class Constant extends Term{

  private final double constVal;

  public Constant(double numVal) {

    this.constVal = numVal;
  }


  @Override
  public double getValue() {
    return constVal;
  }
}

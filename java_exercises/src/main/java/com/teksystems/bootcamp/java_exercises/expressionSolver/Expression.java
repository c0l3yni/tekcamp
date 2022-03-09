package com.teksystems.bootcamp.java_exercises.expressionSolver;

public class Expression extends Term{
  private final Term term1;
  private final Term term2;
  private final Operation operation;

  public Expression(Term term1, Operation operation, Term term2) {
    this.term1 = term1;
    this.term2 = term2;
    this.operation = operation;
  }
  
  @Override
  public double getValue() {
    return operation.calculate(term1.getValue(), term2.getValue());
  }
}

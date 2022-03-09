package com.teksystems.bootcamp.java_exercises.expressionSolver;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdditionOperationTest {

  @Test
  public void testCalculateGivenOnePlusOneReturnTwo() {
    AdditionOperation additionOperation = new AdditionOperation();
    double actual = additionOperation.calculate(1, 1);
    double expected = 2;

    Assert.assertEquals(actual, expected);
  }
  @Test
  public void testCalculateGivenOnePlusNegativeOneReturnZero() {
    AdditionOperation additionOperation = new AdditionOperation();
    double actual = additionOperation.calculate(-1, 1);
    double expected = 0;

    Assert.assertEquals(actual, expected);
  }
}
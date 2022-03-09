package com.teksystems.bootcamp.java_exercises.expressionSolver;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SubtractionOperationTest {

  @Test
  public void testCalculateTwoMinusOneReturnOne() {
    SubtractionOperation subtractionOperation = new SubtractionOperation();
    double actual = subtractionOperation.calculate(2, 1);
    double expected = 1;
    Assert.assertEquals(actual, expected);
  }
  @Test
  public void testCalculateTwoMinusThreeReturnNegativeOne() {
    SubtractionOperation subtractionOperation = new SubtractionOperation();
    double actual = subtractionOperation.calculate(2, 3);
    double expected = -1;
    Assert.assertEquals(actual, expected);
  }
}
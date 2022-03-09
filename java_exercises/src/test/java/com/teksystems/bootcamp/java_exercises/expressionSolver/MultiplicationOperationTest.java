package com.teksystems.bootcamp.java_exercises.expressionSolver;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MultiplicationOperationTest {

  @Test
  public void testCalculateTwoTimesZeroReturnZero() {
    MultiplicationOperation multiplicationOperation = new MultiplicationOperation();
    double actual = multiplicationOperation.calculate(2, 0);
    double expected = 0;
    Assert.assertEquals(actual, expected);
  }
  @Test
  public void testCalculateTwoTimesNegativeOneReturnNegativeTwo() {
    MultiplicationOperation multiplicationOperation = new MultiplicationOperation();
    double actual = multiplicationOperation.calculate(2, -1);
    double expected = -2;
    Assert.assertEquals(actual, expected);
  }
}
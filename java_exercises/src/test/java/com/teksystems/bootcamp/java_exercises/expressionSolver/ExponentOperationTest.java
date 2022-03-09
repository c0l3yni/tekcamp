package com.teksystems.bootcamp.java_exercises.expressionSolver;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExponentOperationTest {

  @Test
  public void testCalculateTwoToThePowerOfTwoReturnFour() {
    ExponentOperation exponentOperation = new ExponentOperation();
    double actual = exponentOperation.calculate(2, 2);
    double expected = 4;
    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testCalculateTwoToThePowerOfZeroReturnOne() {
    ExponentOperation exponentOperation = new ExponentOperation();
    double actual = exponentOperation.calculate(2, 0);
    double expected = 1;
    Assert.assertEquals(actual, expected);
  }
}
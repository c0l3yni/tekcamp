package com.teksystems.bootcamp.java_exercises.expressionSolver;

import org.testng.Assert;
import org.testng.annotations.Test;
import static java.lang.Double.NaN;

public class DivisionOperationTest {

  @Test
  public void testCalculateDivideByZeroReturnNaN() {
    DivisionOperation divisionOperation = new DivisionOperation();
    double actual = divisionOperation.calculate(4, 0);
    double expected = NaN;
    Assert.assertEquals(actual, expected);
  }
}
package com.teksystems.bootcamp.java_exercises.expressionSolver;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ModuloOperationTest {

  @Test
  public void testCalculateFourModuloTwoEqualsZero() {
    ModuloOperation moduloOperation = new ModuloOperation();
    double actual = moduloOperation.calculate(4, 2);
    double expected = 0;
    Assert.assertEquals(actual, expected);
  }
  @Test
  public void testCalculateFiveModuloTwoIsOne() {
    ModuloOperation moduloOperation = new ModuloOperation();
    double actual = moduloOperation.calculate(5, 2);
    double expected = 1;
    Assert.assertEquals(actual, expected);
  }
}
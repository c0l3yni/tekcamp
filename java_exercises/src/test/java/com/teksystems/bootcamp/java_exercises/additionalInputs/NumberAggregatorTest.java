package com.teksystems.bootcamp.java_exercises.additionalInputs;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberAggregatorTest {

  @Test
  public void testAddNumberZero() {
    Assert.assertEquals(new NumberAggregator().addNumber(0), 0);
  }
  @Test
  public void testAddNumbers() {
    NumberAggregator numberAggregator = new NumberAggregator();
    numberAggregator.addNumber(1);
    numberAggregator.addNumber(2);
    Assert.assertEquals(numberAggregator.addNumber(3), 6);
  }


}
package com.teksystems.bootcamp.capstone2.additionalToppings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheeseTest {

  @Test
  public void testGetCost() {
    Cheese cheese = new Cheese();
    double actual = cheese.getCost(3);

    Assert.assertEquals(actual, 3);
  }
}
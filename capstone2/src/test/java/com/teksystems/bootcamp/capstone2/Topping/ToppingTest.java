package com.teksystems.bootcamp.capstone2.Topping;

import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Topping;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToppingTest {

  @Test
  public void testFindMenuOptionSizeOfArrayGivenTwoReturnTwo() {
    int actual = Topping.findMenuOption().size();

    Assert.assertEquals(actual, 2);
  }

  @Test
  public void testToppingConstructorGivenNameRaspberryJamReturnNameRaspberryJam() {
    Topping topping = new Topping("Raspberry Jam", 0);

    Assert.assertEquals(topping.getName(), "Raspberry Jam");
  }

  @Test
  public void testToppingConstructorGivenCostOfOneDollarReturnCostOfOneDollar() {
    Topping topping = new Topping("", 1.00);

    Assert.assertEquals(topping.getCost(), 1.00);
  }
}
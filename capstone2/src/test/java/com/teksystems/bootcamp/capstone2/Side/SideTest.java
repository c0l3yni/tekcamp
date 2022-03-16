package com.teksystems.bootcamp.capstone2.Side;

import com.teksystems.bootcamp.capstone2.MenuItem.Side.Side;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SideTest {

  @Test
  public void testSideConstructorGivenCostOfOneDollarReturnCostOfOneDollar() {
    Side topping = new Side("", 1.00);

    Assert.assertEquals(topping.getCost(), 1.00);
  }

  @Test
  public void testSideConstructorGivenNamePicklesReturnNamePickles() {
    Side topping = new Side("Pickles", 0);

    Assert.assertEquals(topping.getName(), "Pickles");
  }

  @Test
  public void testSideListReceiveArrayWithFourItemsReturnFour() {
    int actual = Side.findMenuOption().size();

    Assert.assertEquals(actual, 4);
  }
}
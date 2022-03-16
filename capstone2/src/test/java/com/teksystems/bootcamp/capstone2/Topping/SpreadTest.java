package com.teksystems.bootcamp.capstone2.Topping;

import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Spread;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpreadTest {

  @Test
  public void testSpreadsListReceiveArrayWithFourItemsReturnFour() {
    int actual = Spread.SpreadsList().size();

    Assert.assertEquals(actual, 4);
  }

  @Test
  public void testFindMenuOptionReceiveArrayWithFourItemsReturnFour() {
    int actual = Spread.findMenuOption().size();

    Assert.assertEquals(actual, 4);
  }
}
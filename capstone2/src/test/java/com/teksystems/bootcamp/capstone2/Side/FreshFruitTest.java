package com.teksystems.bootcamp.capstone2.Side;

import com.teksystems.bootcamp.capstone2.MenuItem.Side.FreshFruit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FreshFruitTest {

  @Test
  public void testFreshFruitListReceiveArrayWithFourItemsReturnFour () {
    int actual = FreshFruit.freshFruitList().size();

    Assert.assertEquals(actual, 4);
  }

  @Test
  public void testFindMenuOptionReceiveArrayWithFourItemsReturnFour () {
    int actual = FreshFruit.findMenuOption().size();

    Assert.assertEquals(actual, 4);
  }
}
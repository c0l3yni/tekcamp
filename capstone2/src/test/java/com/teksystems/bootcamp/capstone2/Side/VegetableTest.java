package com.teksystems.bootcamp.capstone2.Side;

import com.teksystems.bootcamp.capstone2.MenuItem.Side.Vegetable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VegetableTest {

  @Test
  public void testVegetableListReceiveArrayWithFourItemsReturnFour() {
    int actual = Vegetable.VegetableList().size();

    Assert.assertEquals(actual, 4);
  }

  @Test
  public void testFindMenuOptionReceiveArrayWithFourItemsReturnFour() {
    int actual = Vegetable.findMenuOption().size();

    Assert.assertEquals(actual, 4);
  }
}
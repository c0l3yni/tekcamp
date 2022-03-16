package com.teksystems.bootcamp.capstone2.Side;

import com.teksystems.bootcamp.capstone2.MenuItem.Side.Nut;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NutTest {

  @Test
  public void testNutListReceiveArrayWithFourItemsReturnFour () {
    int actual = Nut.nutList().size();

    Assert.assertEquals(actual, 4);
  }

  @Test
  public void testFindMenuOptionReceiveArrayWithFourItemsReturnFour () {
    int actual = Nut.findMenuOption().size();

    Assert.assertEquals(actual, 4);
  }
}
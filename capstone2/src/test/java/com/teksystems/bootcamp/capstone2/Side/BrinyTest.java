package com.teksystems.bootcamp.capstone2.Side;

import com.teksystems.bootcamp.capstone2.MenuItem.Side.Briny;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrinyTest {

  @Test
  public void testBrinyListReceiveArrayWithFourItemsReturnFour () {
    int actual = Briny.brinyList().size();

    Assert.assertEquals(actual, 4);
  }

  @Test
  public void testFindMenuOptionReceiveArrayWithFourItemsReturnFour () {
    int actual = Briny.findMenuOption().size();

    Assert.assertEquals(actual, 4);
  }
}
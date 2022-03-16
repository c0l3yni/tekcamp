package com.teksystems.bootcamp.capstone2.Topping;

import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Dip;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DipTest {

  @Test
  public void testDipListReceiveArrayWithFourItemsReturnFour() {
    int actual = Dip.dipList().size();

    Assert.assertEquals(actual, 4);
  }

  @Test
  public void testFindMenuOptionReceiveArrayWithFourItemsReturnFour() {
    int actual = Dip.findMenuOption().size();

    Assert.assertEquals(actual, 4);
  }
}
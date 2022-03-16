package com.teksystems.bootcamp.capstone2.Entree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.SoftCheese;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftCheeseTest {

  @Test
  public void testSoftCheeseConstructorGivenNameBrieReturnNameBrie() {
    SoftCheese softCheese = new SoftCheese("Brie");

    Assert.assertEquals(softCheese.getName(), "Brie");
  }

  @Test
  public void testSoftCheeseListReceiveArrayWithFourItemsReturnFour () {
    int actual = SoftCheese.softCheeseList().size();

    Assert.assertEquals(actual, 4);
  }

  @Test
  public void testFindMenuOptionReceiveArrayWithFourItemsReturnFour () {
    int actual = SoftCheese.findMenuOption().size();

    Assert.assertEquals(actual, 4);
  }
}
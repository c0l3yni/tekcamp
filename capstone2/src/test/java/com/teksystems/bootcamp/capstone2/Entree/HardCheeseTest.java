package com.teksystems.bootcamp.capstone2.Entree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.HardCheese;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardCheeseTest {

  @Test
  public void testHardCheeseConstructorGivenNameSwissReturnNameSwiss() {
    HardCheese hardCheese = new HardCheese("Swiss");

    Assert.assertEquals(hardCheese.getName(), "Swiss");
  }

  @Test
  public void testHardCheeseListReceiveArrayWithFourItemsReturnFour () {
    int actual = HardCheese.hardCheeseList().size();

    Assert.assertEquals(actual, 4);
  }

  @Test
  public void testFindMenuOptionReceiveArrayWithFourItemsReturnFour () {
    int actual = HardCheese.findMenuOption().size();

    Assert.assertEquals(actual, 4);
  }
}
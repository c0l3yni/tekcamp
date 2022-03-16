package com.teksystems.bootcamp.capstone2.Entree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Meat;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MeatTest {

  @Test
  public void testMeatConstructorGivenNameHamReturnNameHam() {
    Meat meat = new Meat("Ham", 0);

    Assert.assertEquals(meat.getName(), "Ham");
  }

  @Test
  public void testMeatConstructorGivenCostOfOneDollarReturnCostOfOneDollar
      () {
    Meat meat = new Meat("", 1);

    Assert.assertEquals(meat.getCost(), 1);
  }

  @Test
  public void testMeatListReceiveArrayWithFourItemsReturnFour() {
    int actual = Meat.meatList().size();

    Assert.assertEquals(actual, 4);
  }

  @Test
  public void testFindMenuOptionReceiveArrayWithFourItemsReturnFour() {
    int actual = Meat.findMenuOption().size();

    Assert.assertEquals(actual, 4);
  }
}

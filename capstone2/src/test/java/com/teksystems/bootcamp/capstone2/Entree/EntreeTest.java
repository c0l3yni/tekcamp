package com.teksystems.bootcamp.capstone2.Entree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Entree;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntreeTest {

  @Test
  public void testEntreeConstructorGivenNameCheeseReturnNameCheese() {
    Entree entree = new Entree("Cheese", 0);

    Assert.assertEquals(entree.getName(), "Cheese");
  }

@Test
    public void testEntreeConstructorGivenCostOfOneDollarReturnCostOfOneDollar() {
  Entree entree = new Entree("", 1.00);

  Assert.assertEquals(entree.getCost(), 1.00);
}

  @Test
  public void testFindMenuOptionReceiveArrayWithFourItemsReturnFour () {
    int actual = Entree.findMenuOption().size();

    Assert.assertEquals(actual, 3);
  }
}
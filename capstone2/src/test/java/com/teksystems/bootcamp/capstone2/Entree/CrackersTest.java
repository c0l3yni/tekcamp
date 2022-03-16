package com.teksystems.bootcamp.capstone2.Entree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Crackers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrackersTest {
  @Test
  public void testCrackerConstructorGivenNamePitaReturnNamePita() {
    Crackers crackers = new Crackers("Pita", 0);

    Assert.assertEquals(crackers.getName(), "Pita");
  }

  @Test
  public void testMeatConstructorGivenCostOfOneDollarReturnCostOfOneDollar() {
    Crackers crackers = new Crackers("", 1);

    Assert.assertEquals(crackers.getCost(), 1);
  }

  @Test
  public void testCrackerListReceiveArrayWithThreeItemsReturnThree () {
    int actual = Crackers.crackerList().size();

    Assert.assertEquals(actual, 3);
  }

  @Test
  public void testFindMenuOptionReceiveArrayWithThreeItemsReturnThree () {
    int actual = Crackers.findMenuOption().size();

    Assert.assertEquals(actual, 3);
  }
}
package com.teksystems.bootcamp.capstone2.Combo;

import com.teksystems.bootcamp.capstone2.MenuItem.Combo.EnbyOfAllCombo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnbyOfAllComboTest {

  @Test
  public void testEnbyOfAllGivenNameCheese1ReturnNameCheese1() {
    EnbyOfAllCombo block = new EnbyOfAllCombo();
    String actual = block.getCheese1().getName();

    Assert.assertEquals(actual, "Brie");
  }

  @Test
  public void testEnbyOfAllGivenCostOfOneDollarReturnCostOfOneDollar() {
    EnbyOfAllCombo block = new EnbyOfAllCombo();
    double actual = block.getCost();

    Assert.assertEquals(actual, 20);
  }

  @Test
  public void testEnbyOfAllGetComboOptionsReceiveArrayWithTwoItemsReturnTwo() {
    EnbyOfAllCombo block = new EnbyOfAllCombo();
    int actual = block.getComboAllOptions().size();

    Assert.assertEquals(actual, 13);
  }

  @Test
  public void testEnbyOfAllFindMenuOption2() {
    EnbyOfAllCombo block = new EnbyOfAllCombo();
    int actual = block.findMenuOption2().size();

    Assert.assertEquals(actual, 14);
  }
}
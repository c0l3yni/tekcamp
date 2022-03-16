package com.teksystems.bootcamp.capstone2.Combo;

import com.teksystems.bootcamp.capstone2.MenuItem.Combo.ButcherBlock;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButcherBlockTest {

  @Test
  public void testButcherBlockGivenNameMeatReturnNameMeat1() {
    ButcherBlock block = new ButcherBlock();
    String actual = block.getMeat1().getName();

    Assert.assertEquals(actual, "Sopressata");
  }

  @Test
  public void testButcherBlockGivenCostOfOneDollarReturnCostOfOneDollar() {
    ButcherBlock block = new ButcherBlock();
    double actual = block.getCost();

    Assert.assertEquals(actual, 45);
  }

  @Test
  public void testButcherBlockGetComboOptionsReceiveArrayWithTwoItemsReturnTwo () {
    int actual = ButcherBlock.getCombos().size();

    Assert.assertEquals(actual, 2);
  }

  @Test
  public void testButcherBlockFindMenuOption2() {
    ButcherBlock butcherBlock = new ButcherBlock();
    int actual = butcherBlock.findMenuOption2().size();

    Assert.assertEquals(actual, 24);
  }
}
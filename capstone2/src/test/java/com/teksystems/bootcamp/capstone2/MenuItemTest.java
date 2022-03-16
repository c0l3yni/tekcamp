package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuItemTest {

  @Test
  public void testGetNameGivenNameMenuReturnNameMenu() {
    MenuItem menuItem = new MenuItem("menu", 1.00);
    String actual = menuItem.getName();

    Assert.assertEquals(actual, "menu");
  }

  @Test
  public void testGetCostGivenCostOfOneDollarReturnCostOfOneDollar() {
    MenuItem menuItem = new MenuItem("", 1.00);
    double actual = menuItem.getCost();

    Assert.assertEquals(actual, 1.00);
  }
}
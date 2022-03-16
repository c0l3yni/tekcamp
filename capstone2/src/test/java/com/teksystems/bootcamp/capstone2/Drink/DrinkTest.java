package com.teksystems.bootcamp.capstone2.Drink;

import com.teksystems.bootcamp.capstone2.MenuItem.Drink.Drink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DrinkTest {

  @Test
  public void testDrinkGivenNameCoffeeReturnNameCoffee() {
    Drink drink = new Drink("Coffee", 0);

    Assert.assertEquals(drink.getName(), "Coffee");
  }

  @Test
  public void testDrinkGivenCostOfOneDollarReturnCostOfOneDollar() {
    Drink drink = new Drink("", 1.00);

    Assert.assertEquals(drink.getCost(), 1.00);
  }

  @Test
  public void testDrinkListReceiveArrayWithFourItemsReturnFour () {
    int actual = Drink.drinkList().size();

    Assert.assertEquals(actual, 5);
  }

  @Test
  public void testFindMenuOptionReceiveArrayWithFourItemsReturnFour () {
    int actual = Drink.findMenuOption().size();

    Assert.assertEquals(actual, 5);
  }


}
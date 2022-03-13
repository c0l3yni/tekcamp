package com.teksystems.bootcamp.capstone2.Checkout;

import com.teksystems.bootcamp.capstone2.MenuItem.Drink;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddDrink {
  public void drinkMenu() {

    getInput("Which kind of drink would you like?" + Drink.findDrinkNumber());
    createReceipt(new Drink());
  }
}

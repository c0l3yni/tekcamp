package com.teksystems.bootcamp.capstone2.Checkout.AddSide;

import com.teksystems.bootcamp.capstone2.MenuItem.Side.FreshFruit;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddFreshFruit {
  public AddFreshFruit() {
    int order = getInput("Which fresh fruit would you like?", FreshFruit.findMenuOption());
    FreshFruit choice = FreshFruit.freshFruitList().get(order);
    createReceipt(choice);
  }
}


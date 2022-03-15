package com.teksystems.bootcamp.capstone2.Checkout.AddCombo;

import com.teksystems.bootcamp.capstone2.MenuItem.Combo.Combo;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddCombo {

  public AddCombo() {
    int value = getInput("Which COMBO would you like?", Combo.findMenuOption());
    if (value == 0) {
      new AddEnbyOfAll();
    } else {
      new AddButcherBlock();
    }
  }
}

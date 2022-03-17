package com.teksystems.bootcamp.capstone2.AddToOrder.AddCombo;

import com.teksystems.bootcamp.capstone2.MenuItem.Combo.Combo;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;

public class AddCombo {

  public AddCombo() {
    int value = getInput("Which COMBO would you like?", Combo.findMenuOption());
    if (value == 1) {
      new AddEnbyOfAll();
    } else {
      new AddButcherBlock();
    }
  }
}

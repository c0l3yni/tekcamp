package com.teksystems.bootcamp.capstone2.AddToOrder.AddEntree;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Cheese;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;

public class AddCheese {
  public AddCheese() {
    int menuItem = getInput("Press 1 for Hard Cheese or 2 for Soft Cheeses", Cheese.findMenuOption());
    if (menuItem == 1) {
      new AddHardCheese();
    } else {
      new AddSoftCheese();
    }
  }
}

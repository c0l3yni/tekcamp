package com.teksystems.bootcamp.capstone2.Checkout.AddTopping;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Topping;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddTopping {
  public AddTopping() {
    int value = getInput("Which kind of topping would you like?", Topping.findMenuOption());
    switch (value) {
      case 0:
        new AddDips();
        break;
      case 1:
        new AddSpreads();
        break;
    }
  }
}

package com.teksystems.bootcamp.capstone2.AddToOrder.AddTopping;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Topping;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;

public class AddTopping {
  public AddTopping() {
    System.out.println("__________________________________________________");
    int value = getInput("Which kind of topping would you like?", Topping.findMenuOption());
    System.out.println("__________________________________________________");
    switch (value) {
      case 1:
        new AddDips();
        break;
      case 2:
        new AddSpreads();
        break;
    }
  }
}

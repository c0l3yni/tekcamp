package com.teksystems.bootcamp.capstone2.Checkout.AddEntree;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddCheese {
  public AddCheese() {
    int menuItem = getInput("Press 1 for Hard Cheese or 2 for Soft Cheeses");
    if (menuItem == 1) {
      new AddHardCheese();
    } else {
      new AddSoftCheese();
    }
  }
}

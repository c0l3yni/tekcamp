package com.teksystems.bootcamp.capstone2.Checkout.AddTopping;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Topping;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddTopping {
  public AddTopping() {
    int value = getInput("Which kind of topping would you like?" + Topping.findToppingNumber());
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

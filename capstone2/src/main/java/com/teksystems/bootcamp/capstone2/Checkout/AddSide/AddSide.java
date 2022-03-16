package com.teksystems.bootcamp.capstone2.Checkout.AddSide;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Side;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddSide {
  public AddSide() {
    int value = getInput("Which kind of side would you like?", Side.findMenuOption());
    switch (value) {
      case 1:
        new AddBriny();
        break;
      case 2:
        new AddNuts();
        break;
      case 3:
        new AddFreshFruit();
        break;
      case 4:
        new AddVegetable();
        break;
    }
  }
}

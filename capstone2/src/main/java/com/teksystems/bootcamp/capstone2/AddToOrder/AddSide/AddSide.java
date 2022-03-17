package com.teksystems.bootcamp.capstone2.AddToOrder.AddSide;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Side;
import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;

public class AddSide {
  public AddSide() {
    System.out.println("__________________________________________________");
    int value = getInput("Which kind of side would you like?", Side.findMenuOption());
    System.out.println("__________________________________________________");
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

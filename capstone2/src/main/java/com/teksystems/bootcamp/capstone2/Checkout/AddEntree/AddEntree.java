package com.teksystems.bootcamp.capstone2.Checkout.AddEntree;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Entree;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddEntree {
  public AddEntree() {
    int value = getInput("Which kind of entree would you like?", Entree.findMenuOption());
    switch (value) {
      case 0:
        new AddCheese();
        break;
      case 1:
        new AddMeat();
        break;
      case 2:
        new AddCrackers();
        break;
    }
  }
}

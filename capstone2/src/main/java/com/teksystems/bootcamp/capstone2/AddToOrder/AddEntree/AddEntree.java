package com.teksystems.bootcamp.capstone2.AddToOrder.AddEntree;

import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Entree;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;

public class AddEntree {
  public AddEntree() {
    System.out.println("__________________________________________________");
    int value = getInput("Which kind of entree would you like?", Entree.findMenuOption());
    System.out.println("__________________________________________________");
    switch (value) {
      case 1:
        new AddCheese();
        break;
      case 2:
        new AddMeat();
        break;
      case 3:
        new AddCrackers();
        break;
    }
  }
}

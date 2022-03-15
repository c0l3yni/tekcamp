package com.teksystems.bootcamp.capstone2.Checkout.AddSide;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Vegetable;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddVegetable {
  public AddVegetable() {
    int order = getInput("Which vegetable would you like?", Vegetable.findMenuOption());
    Vegetable choice = Vegetable.VegetableList().get(order);
    createReceipt(choice);
  }
}

package com.teksystems.bootcamp.capstone2.Checkout.AddSide;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Nut;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddNuts {
  public AddNuts() {
    int order = getInput("What kind of nuts would you like?" + Nut.findNutNumber());
    Nut choice = Nut.nutList().get(order);
    createReceipt(choice);
  }
}

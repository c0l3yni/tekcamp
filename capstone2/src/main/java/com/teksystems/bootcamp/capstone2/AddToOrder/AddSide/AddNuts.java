package com.teksystems.bootcamp.capstone2.AddToOrder.AddSide;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Nut;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddNuts {
  public AddNuts() {
    int order = getInput("What kind of nuts would you like?", Nut.findMenuOption());
    Nut choice = Nut.nutList().get(order-1);
    createReceipt(choice);
  }
}


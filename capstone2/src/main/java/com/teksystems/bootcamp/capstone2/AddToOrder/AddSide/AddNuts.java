package com.teksystems.bootcamp.capstone2.AddToOrder.AddSide;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Nut;

import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddNuts {
  public AddNuts() {
    System.out.println("__________________________________________________");
    int order = getInput("What kind of nuts would you like?", Nut.findMenuOption());
    System.out.println("__________________________________________________");
    Nut choice = Nut.nutList().get(order-1);
    createReceipt(choice);
  }
}


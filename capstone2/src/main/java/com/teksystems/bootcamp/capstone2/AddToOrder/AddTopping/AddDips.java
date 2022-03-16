package com.teksystems.bootcamp.capstone2.AddToOrder.AddTopping;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Dip;
import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddDips {
  public AddDips() {
    int order = getInput("Which dip would you like?", Dip.findMenuOption());
    Dip choice = Dip.dipList().get(order-1);
    createReceipt(choice);
  }
}
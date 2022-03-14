package com.teksystems.bootcamp.capstone2.Checkout.AddTopping;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Dip;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddDips {
  public AddDips() {
    int order = getInput("Which dip would you like?" + Dip.findDips());
    Dip choice = Dip.dipList().get(order);
    createReceipt(choice);
  }
}
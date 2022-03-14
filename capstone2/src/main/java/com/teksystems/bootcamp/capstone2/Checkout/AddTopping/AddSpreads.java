package com.teksystems.bootcamp.capstone2.Checkout.AddTopping;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Spread;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddSpreads {
  public AddSpreads(){
  int order = getInput("Which spread would you like?" + Spread.findSpreadsNumber());
  Spread choice = Spread.SpreadsList().get(order);
  createReceipt(choice);
}
}
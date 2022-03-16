package com.teksystems.bootcamp.capstone2.AddToOrder.AddTopping;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Spread;
import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddSpreads {
  public AddSpreads(){
  int order = getInput("Which spread would you like?", Spread.findMenuOption());
  Spread choice = Spread.SpreadsList().get(order-1);
  createReceipt(choice);
}
}
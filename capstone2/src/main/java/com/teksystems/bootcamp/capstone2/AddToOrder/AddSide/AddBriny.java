package com.teksystems.bootcamp.capstone2.AddToOrder.AddSide;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Briny;
import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddBriny {
  public AddBriny() {
    int order = getInput("Which savory side would you like?", Briny.findMenuOption());
    Briny choice = Briny.brinyList().get(order-1);
    createReceipt(choice);
  }
}

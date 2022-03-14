package com.teksystems.bootcamp.capstone2.Checkout.AddSide;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Briny;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddBriny {
  public AddBriny() {
    int order = getInput("Which savory side would you like?" + Briny.findBrinyNumber());
    Briny choice = Briny.brinyList().get(order);
    createReceipt(choice);
  }
}

package com.teksystems.bootcamp.capstone2.Checkout;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Briny;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddBriny {
  public void brinyMenu() {
    getInput("Which kind of Savory Side would you like?" + Briny.findBrinyNumber());
    createReceipt(new Briny());
  }
}

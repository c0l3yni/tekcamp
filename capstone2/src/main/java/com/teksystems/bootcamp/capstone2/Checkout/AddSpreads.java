package com.teksystems.bootcamp.capstone2.Checkout;
import com.teksystems.bootcamp.capstone2.MenuItem.Topping.Spreads;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddSpreads {
  public static void spreadsMenu() {
    getInput("Which kind of topping would you like?" + Spreads.findSpreadsNumber());
    /*    createReceipt(new Crackers());*/
  }
}
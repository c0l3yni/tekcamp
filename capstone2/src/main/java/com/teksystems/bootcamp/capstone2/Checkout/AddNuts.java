package com.teksystems.bootcamp.capstone2.Checkout;

import com.teksystems.bootcamp.capstone2.Menu.Side.Nuts;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddNuts {
  public static void nutMenu() {
  getInput("Which kind of nut would you like?" + Nuts.findNutNumber());
  createReceipt(new Nuts());
}
}

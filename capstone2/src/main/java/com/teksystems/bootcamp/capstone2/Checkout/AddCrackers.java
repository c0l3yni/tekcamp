package com.teksystems.bootcamp.capstone2.Checkout;

import com.teksystems.bootcamp.capstone2.Menu.Entree.Crackers;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddCrackers {
  public static void crackerMenu() {
    getInput("Which kind of crackers would you like?" + Crackers.findCrackerNumber());
    createReceipt(new Crackers());
  }
}

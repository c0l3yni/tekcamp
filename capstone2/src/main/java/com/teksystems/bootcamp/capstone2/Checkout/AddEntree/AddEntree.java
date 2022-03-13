package com.teksystems.bootcamp.capstone2.Checkout.AddEntree;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Entree;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
/*
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;
*/

public class AddEntree {
  public AddEntree() {
    getInput("Which kind of entree would you like?" + Entree.findEntreeNumber());
/*        createReceipt(new Entree());*/
  }

}

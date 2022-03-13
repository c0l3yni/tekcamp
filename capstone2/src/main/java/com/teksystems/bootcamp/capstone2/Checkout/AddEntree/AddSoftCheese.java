package com.teksystems.bootcamp.capstone2.Checkout.AddEntree;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.SoftCheese;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;


public class AddSoftCheese {
  public AddSoftCheese() {
    int order = getInput("Which soft cheese would you like?" + SoftCheese.findSoftCheese());
    SoftCheese choice = SoftCheese.softCheeseList().get(order);
    createReceipt(choice);
  }
}

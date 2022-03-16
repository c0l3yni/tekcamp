package com.teksystems.bootcamp.capstone2.AddToOrder.AddEntree;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.HardCheese;
import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddHardCheese {
  public AddHardCheese() {

    int order = getInput("Which hard cheese would you like?", HardCheese.findMenuOption());
    HardCheese choice = HardCheese.hardCheeseList().get(order-1);
    createReceipt(choice);
  }
}

package com.teksystems.bootcamp.capstone2.AddToOrder.AddEntree;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.SoftCheese;
import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;


public class AddSoftCheese {
  public AddSoftCheese() {
    System.out.println("__________________________________________________");
    int order = getInput("Which soft cheese would you like?", SoftCheese.findMenuOption());
    System.out.println("__________________________________________________");
    SoftCheese choice = SoftCheese.softCheeseList().get(order-1);
    createReceipt(choice);
  }
}

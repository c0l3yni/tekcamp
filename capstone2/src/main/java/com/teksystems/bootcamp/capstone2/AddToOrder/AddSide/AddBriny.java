package com.teksystems.bootcamp.capstone2.AddToOrder.AddSide;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.Briny;
import static com.teksystems.bootcamp.capstone2.AddToOrder.UserInput.getInput;
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;

public class AddBriny {
  public AddBriny() {
    System.out.println("__________________________________________________");
    int order = getInput("Which savory side would you like?", Briny.findMenuOption());
    System.out.println("__________________________________________________");
    Briny choice = Briny.brinyList().get(order-1);
    createReceipt(choice);
  }
}

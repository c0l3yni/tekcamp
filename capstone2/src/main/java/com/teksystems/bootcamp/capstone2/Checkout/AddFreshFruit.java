package com.teksystems.bootcamp.capstone2.Checkout;
import com.teksystems.bootcamp.capstone2.MenuItem.Side.FreshFruit;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class AddFreshFruit {
  public static void freshFruitMenu() {
    getInput("Which kind of fruit would you like?" + FreshFruit.findFreshFruitNumber());
/*    createReceipt(new FreshFruit());*/
  }
}

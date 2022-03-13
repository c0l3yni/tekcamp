package com.teksystems.bootcamp.capstone2.Checkout.AddEntree;
import com.teksystems.bootcamp.capstone2.MenuItem.Entree.Entree;
import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;
/*
import static com.teksystems.bootcamp.capstone2.Main.createReceipt;
*/

public class AddEntree {
  public AddEntree() {
    int value = getInput("Which kind of entree would you like?" + Entree.findEntreeNumber());
    switch (value) {
      case 0:
        new AddCheese();
        break;
      case 1:
        new AddMeat();
        break;
      case 2:
        new AddCrackers();
        break;
    }
/*        createReceipt(new Entree());*/
  }

}

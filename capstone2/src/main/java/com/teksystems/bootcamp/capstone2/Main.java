package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.Checkout.*;
import com.teksystems.bootcamp.capstone2.Checkout.AddDrink.AddDrink;
import com.teksystems.bootcamp.capstone2.Checkout.AddEntree.*;
import com.teksystems.bootcamp.capstone2.Checkout.AddSide.*;
import com.teksystems.bootcamp.capstone2.Checkout.AddTopping.AddDips;
import com.teksystems.bootcamp.capstone2.Checkout.AddTopping.AddSpreads;
import com.teksystems.bootcamp.capstone2.Checkout.AddTopping.AddTopping;
import com.teksystems.bootcamp.capstone2.MenuItem.MenuItem;

import java.text.DecimalFormat;
import java.util.Scanner;

import static com.teksystems.bootcamp.capstone2.Checkout.UserInput.getInput;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Press 1 for meal menu or 2 for meal builder: ");
    if (scanner.nextDouble() == 1) {
      System.out.println("meal options");
    } else {
      while (true) {
        System.out.println("Press 1 for entree, 2 for toppings, 3 for sides, 4 for drinks, or 5 to go back");
        int menuItem;
        menuItem = scanner.nextInt();
        if (menuItem == 5){
          break;
        }
        switch (menuItem) {
          case 1:
            new AddEntree();
            break;
          case 2:
           new AddTopping();
          case 3:
            new AddSide();
            break;
          case 4:
            new AddDrink();
            break;
        }
      }
    }
  }

  public static Receipt receipt = new Receipt();
  public static void createReceipt(MenuItem item) {
    double addToCart = item.getCost();
    double subtotal = receipt.receiptSubTotal(addToCart);
    double taxTotal = receipt.receiptTaxTotal(subtotal);
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("Your current total is " + "$ " + df.format(taxTotal));
  }
}
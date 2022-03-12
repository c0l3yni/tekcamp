package com.teksystems.bootcamp.capstone2;

import com.teksystems.bootcamp.capstone2.additionalToppings.Cheese;
import com.teksystems.bootcamp.capstone2.purchaseFood.Receipt;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Press 1 for meal menu or 2 for meal builder: ");
    Receipt receipt = new Receipt();
    Cheese cheese = new Cheese();

    if (scanner.nextDouble() == 2) {
      System.out.println("Add manchego for 3 dollars? Press 1 for yes and 2 for no");

      if(scanner.nextDouble() == 1){
        double price = receipt.receiptSubTotal(12);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Your total is " + "$" + df.format(price));

      } else {
        System.out.print("Press 1 for meal menu or 2 for meal builder: ");
      }
    }
  }
}

package com.teksystems.bootcamp.capstone2.Checkout;

import java.util.Scanner;

public class UserInput {
  public static int getInput(String question) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.nextInt();
  }
}

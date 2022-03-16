package com.teksystems.bootcamp.capstone2.Checkout;

import java.util.Map;
import java.util.Scanner;

public class UserInput {
  public static int getInput(String question, Map<String, String> options) {
    for (int i = 1; i <= options.size(); i++) {
      System.out.println(i + ": " + options.get(String.valueOf(i)));
    }
    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.nextInt();
  }
}

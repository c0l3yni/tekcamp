package com.teksystems.bootcamp.capstone2.Checkout;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInput {
  public static int getInput(String question, HashMap<String, String> options) {

    for (Map.Entry option : options.entrySet()) {
      String key = (String) option.getKey();
      String value = ((String) option.getValue());
      System.out.println(key + ": " + value);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.println(question);
    return scanner.nextInt();
  }
}
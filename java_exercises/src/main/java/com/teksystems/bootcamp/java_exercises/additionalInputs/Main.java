package com.teksystems.bootcamp.java_exercises.additionalInputs;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner userNumber = new Scanner(System.in);
    NumberAggregator numberAggregator = new NumberAggregator();
    int total = 0;

    while (true) {
      System.out.print("Enter a number: ");
      try {
        int number = userNumber.nextInt();
        total = numberAggregator.addNumber(number);
      } catch (Exception e) {
        System.out.println("The sum equals " + total);
        break;
      }
    }
  }
}

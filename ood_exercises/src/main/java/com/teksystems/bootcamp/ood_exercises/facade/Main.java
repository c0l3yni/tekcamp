package com.teksystems.bootcamp.ood_exercises.facade;

public class Main {
  public static void main(String[] args) {
    OrderFacade facade = new OrderFacade();
    facade.orderItemFacade("Octopus", 1, "4500 Lake Air, Austin, TX, 75612", "1234 1234 1234 1234 12/20 123");
  }
}

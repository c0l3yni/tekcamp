package com.teksystems.bootcamp.ood_exercises.facade;

public class ShipOrder implements SystemFeedback{
  @Override
  public void soutInfo(String name) {
    System.out.println(name);
  }

  public void shipOrder(int quantity, String name, String address) {
    System.out.println("____________________");
    System.out.println("What address should we ship the order to?");
    System.out.println(address);
    System.out.println("____________________");
    soutInfo("Order of " + quantity + " " + name + " was shipped to " + address);
    System.out.println();
  }

}

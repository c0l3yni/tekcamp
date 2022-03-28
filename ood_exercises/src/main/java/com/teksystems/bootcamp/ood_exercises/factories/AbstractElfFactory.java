package com.teksystems.bootcamp.ood_exercises.factories;

public class AbstractElfFactory {
  public static Elf make(String type) {
    Elf elfFactory = null;
    if (type.equals("nice")) {
      elfFactory = new ToyElf();
    } else if (type.equals("naughty")) {
      elfFactory = new CoalElf();
    }
    return elfFactory;
  }
}

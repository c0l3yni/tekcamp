package com.teksystems.bootcamp.ood_exercises.template;

public abstract class MadLibs {
  String reset = "\033[0m";
  String purple = "\033[0;95m";

  public void play() {
    System.out.println("    Today, " + getDate() + ", is the day " +
        purple + getName() + reset +
        " would join their team of " +
        purple + getJob() + reset +
        "'s. \n" + "The team " +
        purple + getVerbED() + reset +
        " the morning with a cup of " +
        purple + getDrink() + reset +
        " and a bowl of " +
        purple + getFood() + reset +
        ". While " +
        purple + getVerbINGOne() + reset +
        ", some team \n" + "members " +
        purple + getVerbED() + reset +
        " by the TV; a news reporter began " +
        purple + getVerbINGOne() + reset +
        " about people " +
        purple + getVerbING() + reset +
        " in their TV’s! This \n" + "made " +
        purple + getName() + reset +
        " walk toward the TV with curiosity. They " +
        purple + getVerbED() + reset +
        " a foot on the screen and ZAP! They were all \n" +
        purple + getVerbING() + reset +
        ". They " +
        purple + getVerbED() + reset +
        " in a " +
        purple + getRoom() + reset +
        " with walls " +
        purple + getVerbED() + reset +
        " with git logs and commands. They ran to the nearest wall \n" + "and " +
        purple + getVerbEDOne() + reset +
        " the letter Q. This caused the floor to disappear and " +
        purple + getName() + reset +
        " began " +
        purple + getVerbING() + reset +
        ". \n" + "    They landed on an accordion that would not open! They tried " +
        purple + getVerbINGOne() + reset +
        ", " +
        purple + getVerbINGTwo() + reset +
        ", and " +
        purple + getVerbINGThree() + reset +
        " but it would \n" + "not work. That's when " +
        purple + getName() + reset + " made a deal with the accordion," +
        "\n       if I tap on you-- then open," +
        "\n       if I tap again-- close,\n" +
        "       otherwise stay as you were. " +
        "\nThis conditional worked! The accordion was so " +
        purple + getFeeling() + reset +
        " it blew " +
        purple + getName() + reset +
        " away… " +
        purple + getName() + reset +
        " did not know how to react.\n" + "    Instead of react, they ran to the door labeled back end. " +
        purple + getName() + reset +
        " thought, “This must be the way out… \n" + "it’s only logical.” They " +
        purple + getVerbED() + reset +
        "on the door and was met with java. When " + "they reached for the coffee \n" + "they were met with the properties that make up a coffee, " +
        purple + getPropertyOne() + reset +
        ", " +
        purple + getPropertyTwo() + reset +
        ", \n" +
        purple + getPropertyThree() + reset +
        "… but it was all private! Frustrated, they ran to the phone in the main room and called \n" + "the only number listed… constructor. Constructor gave them all the instructions for making a coffee, \n" + "but wouldn’t give them the coffee. Java was hard and this pattern had to stop. While they searched \n" + "for the exit the process kept " +
        purple + getVerbINGThree() + reset +
        ". " +
        purple + getName() + reset +
        " began " +
        purple + getVerbINGTwo() + reset +
        ", 'I just need a break!'. All of the sudden they \n" + "were in a room looking at the TV… and running late... \n");
  }

  abstract String getVerbINGThree();
  abstract String getVerbINGTwo();
  abstract String getVerbINGOne();
  abstract String getVerbEDOne();
  abstract String getPropertyThree();
  abstract String getPropertyTwo();
  abstract String getVerbING();
  abstract String getVerbED();
  abstract String getJob();
  abstract String getFeeling();
  abstract String getPropertyOne();
  abstract String getRoom();
  abstract String getDrink();
  abstract String getFood();
  abstract String getDate();
  abstract String getName();
}

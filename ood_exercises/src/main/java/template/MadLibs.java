package template;

public abstract class MadLibs {
  public void play() {
    System.out.println("    Today, " + getDate() + ", is the day " +
        consoleColors.purple + getName() + consoleColors.reset +
        " would join their team of " +
        consoleColors.purple + getJob() + consoleColors.reset +
        "'s. \n" + "The team " +
        consoleColors.purple + getVerbED() + consoleColors.reset +
        " the morning with a cup of " +
        consoleColors.purple + getDrink() + consoleColors.reset +
        " and a bowl of " +
        consoleColors.purple + getFood() + consoleColors.reset +
        ". While " +
        consoleColors.purple + getVerbINGOne() + consoleColors.reset +
        ", some team \n" + "members " +
        consoleColors.purple + getVerbED() + consoleColors.reset +
        " by the TV; a news reporter began " +
        consoleColors.purple + getVerbINGOne() + consoleColors.reset +
        " about people " +
        consoleColors.purple + getVerbING() + consoleColors.reset +
        " in their TV’s! This \n" +
        "made " +
        consoleColors.purple + getName() + consoleColors.reset +
        " walk toward the TV with curiosity. " +
        "They " +
        consoleColors.purple + getVerbED() + consoleColors.reset +
        " a foot on the screen and ZAP! They were all \n" +
        consoleColors.purple + getVerbING() + consoleColors.reset +
        ". They " +
        consoleColors.purple + getVerbED() + consoleColors.reset +
        " in a " +
        consoleColors.purple + getRoom() + consoleColors.reset +
        " with walls " +
        consoleColors.purple + getVerbED() + consoleColors.reset +
        " with git logs and commands. They ran to the nearest wall \n" + "and " +
        consoleColors.purple + getVerbEDOne() + consoleColors.reset +
        " the letter Q. This caused the floor to disappear and " +
        consoleColors.purple + getName() + consoleColors.reset +
        " began " +
        consoleColors.purple + getVerbING() + consoleColors.reset +
        ". \n" + "    They landed on an accordion that would not open! They tried " +
        consoleColors.purple + getVerbINGOne() + consoleColors.reset +
        ", " +
        consoleColors.purple + getVerbINGTwo() + consoleColors.reset +
        ", and " +
        consoleColors.purple + getVerbINGThree() + consoleColors.reset +
        " but it would \n" + "not work. That's when " +
        consoleColors.purple + getName() + consoleColors.reset + " made a deal with the accordion," +
        "\n       if I tap on you-- then open," +
        "\n       if I tap again-- close,\n" +
        "       otherwise stay as you were. " +
        "\nThis conditional worked! The accordion was so " +
        consoleColors.purple + getFeeling() + consoleColors.reset +
        " it blew " +
        consoleColors.purple + getName() + consoleColors.reset +
        " away… " +
        consoleColors.purple + getName() + consoleColors.reset +
        " did not know how to react.\n" + "    Instead of react, they ran to the door labeled back end. " +
        consoleColors.purple + getName() + consoleColors.reset +
        " thought, “This must be the way out… \n" + "it’s only logical.” They " +
        consoleColors.purple + getVerbED() + consoleColors.reset +
        "on the door and was met with java. When " + "they reached for the coffee \n" + "they were met with the properties that make up a coffee, " +
        consoleColors.purple + getPropertyOne() + consoleColors.reset +
        ", " +
        consoleColors.purple + getPropertyTwo() + consoleColors.reset +
        ", \n" +
        consoleColors.purple + getPropertyThree() + consoleColors.reset +
        "… but it was all private! Frustrated, they ran to the phone in the main room and called \n" + "the only number listed… constructor. Constructor gave them all the instructions for making a coffee, \n" + "but wouldn’t give them the coffee. Java was hard and this pattern had to stop. While they searched \n" + "for the exit the process kept " +
        consoleColors.purple + getVerbINGThree() + consoleColors.reset +
        ". " +
        consoleColors.purple + getName() + consoleColors.reset +
        " began " +
        consoleColors.purple + getVerbINGTwo() + consoleColors.reset +
        ", 'I just need a break!'. All of the sudden they \n" +
        "were in a room looking at the TV… and running late... \n");
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

  public static class consoleColors {
    public static final String reset = "\033[0m";
    public static final String purple = "\033[0;95m";
  }
}

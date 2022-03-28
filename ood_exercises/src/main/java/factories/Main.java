package factories;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String reset = "\033[0m";
    String red = "\033[0;31m";
    String green = "\033[0;32m";
    Scanner scanner = new Scanner(System.in);

    boolean continueFlag = true;
    while (continueFlag) {
      int userMode = 0;
      System.out.println("___________________________________________________");
      System.out.println("      *            Press      *   *       *       * ");
      System.out.println("   *   " + red + " 1 for Naughty " + green + "and Nice List" + reset + "   *");
      System.out.println(green + " 2 for Generate Elves " + red + "(WARNING: Christmas eve ONLY!)" + reset);
      System.out.println("  *     *      3 to SHUTDOWN       *         *     ");
      System.out.println("*    *         *        *    *           *      * ");

      while (!scanner.hasNextInt()) {
        System.out.println(green + "Invalid input is naughty,");
        System.out.println(red + "you really should get coal,");
        System.out.println(green + "I'll let you try again,");
        System.out.println(red + "being nice is the goal!" + reset);
        scanner.next();
      }
      userMode = scanner.nextInt();
      switch (userMode) {
        case 1:
          System.out.println(findChildList());
          break;

        case 2:
          for (Map.Entry<String, String> entry : findChildList().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            Elf elfType = AbstractElfFactory.make(value);
            System.out.println(red + key + green + " was " + value + " so they get a " + elfType.getClass().getSimpleName() + reset);
            elfType.create();
            elfType.wrap();
            elfType.give();
            System.out.println();
          }
          break;

        case 3:
          System.out.println("Shutting down...");
          continueFlag = false;
          break;
        default:
          System.out.println(green + "Please be nice, " + red + "don't make this mistake twice! " + reset + "Choose a number between 1-3");
      }
    }
  }

  public static HashMap<String, String> findChildList() {
    HashMap<String, String> findChild = new HashMap<>();
    findChild.put("Chet", "nice");
    findChild.put("Amanda", "naughty");
    findChild.put("Ronald", "nice");
    findChild.put("Bob", "naughty");
    findChild.put("Kim", "nice");
    findChild.put("Ashley", "naughty");
    return findChild;
  }
}


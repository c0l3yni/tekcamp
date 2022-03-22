package factories;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean continueFlag = true;
    while (continueFlag) {
      int userMode = 0;
      System.out.println("___________________________________________________");
      System.out.println("      *            Press      *   *       *       * ");
      System.out.println("   *   " + ConsoleColors.RED + " 1 for Naughty " + ConsoleColors.GREEN + "and Nice List" + ConsoleColors.RESET + "   *");
      System.out.println(ConsoleColors.GREEN + " 2 for Generate Elves " + ConsoleColors.RED + "(WARNING: Christmas eve ONLY!)" + ConsoleColors.RESET);
      System.out.println("  *     *      3 to SHUTDOWN       *         *     ");
      System.out.println("*    *         *        *    *           *      * ");

      while (!scanner.hasNextInt()) {
        System.out.println(ConsoleColors.GREEN + "Invalid input is naughty,");
        System.out.println(ConsoleColors.RED + "you really should get coal,");
        System.out.println(ConsoleColors.GREEN + "I'll let you try again,");
        System.out.println(ConsoleColors.RED + "being nice is the goal!" + ConsoleColors.RESET);
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

            ElfAbstractFactory eaf = ElfMaker.make(value);
            Elf elfType = eaf.createElf();
            System.out.println(ConsoleColors.RED + key + ConsoleColors.GREEN + " was " + value + " so they get a " + elfType.getClass().getSimpleName() + ConsoleColors.RESET);
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
          System.out.println(ConsoleColors.GREEN + "Please be nice, " + ConsoleColors.RED + "don't make this mistake twice! " + ConsoleColors.RESET + "Choose a number between 1-3");
      }
    }
  }

  public static class ConsoleColors {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
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


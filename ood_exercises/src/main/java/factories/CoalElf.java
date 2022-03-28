package factories;

public class CoalElf implements Elf {
  @Override
  public void wrap() {

    System.out.println("wrapping the coal...");
  }

  @Override
  public void create() {

    System.out.println("creating the coal...");
  }

  @Override
  public void give() {

    System.out.println("giving the coal...");
  }
}

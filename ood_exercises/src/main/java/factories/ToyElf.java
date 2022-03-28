package factories;

public class ToyElf implements Elf {

  @Override
  public void wrap() {

    System.out.println("wrapping the toy...");
  }

  @Override
  public void create() {

    System.out.println("creating the toy...");
  }

  @Override
  public void give() {

    System.out.println("giving the toy...");
  }
}

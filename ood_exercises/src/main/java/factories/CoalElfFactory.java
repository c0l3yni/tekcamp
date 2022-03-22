package factories;

public class CoalElfFactory extends ElfAbstractFactory {
  @Override
  public Elf createElf() {
    return new CoalElf();
  }
}

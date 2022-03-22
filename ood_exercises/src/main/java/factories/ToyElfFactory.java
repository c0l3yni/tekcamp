package factories;

public class ToyElfFactory extends ElfAbstractFactory {
  @Override
  public Elf createElf() {
    return new ToyElf();
  }
}

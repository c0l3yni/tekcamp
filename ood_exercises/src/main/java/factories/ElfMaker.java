package factories;

public class ElfMaker {
  public static ElfAbstractFactory make(String type) {
    ElfAbstractFactory elfFactory = null;
    if (type.equals("nice")) {
      elfFactory = new ToyElfFactory();
    } else if (type.equals("naughty")) {
      elfFactory = new CoalElfFactory();
    }
    return elfFactory;
  }
}

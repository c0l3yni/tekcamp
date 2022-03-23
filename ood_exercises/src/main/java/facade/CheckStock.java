package facade;

public class CheckStock {
  public int checkStock(String name) {
    System.out.println("checking stock...");
    int i = 0;
    if (Stock.stockList().get(i).getQuantity() >=0) {
      System.out.println("stock is availble");
    } else {
      System.out.println("stock in not available");
    }
    return 100;
  }

  public boolean orderAllowed() {
    String name = "Octopus";
    int quantity = 3;
    if (checkStock(name) == 0) {
      return false;
    } else {
      return true;
    }
  }
}


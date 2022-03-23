package facade;

public class OrderFacade {
  public void CheckStock(String name, int quantity) {
    CheckStock stock = new CheckStock();
    PlaceOrder order = new PlaceOrder();
    if (stock.checkStock(name) >= 0) {
      if (stock.orderAllowed()) {
        order.placeOrder(name, quantity);
      } else {
        System.out.println("No stock available");
      }
    }
  }
}

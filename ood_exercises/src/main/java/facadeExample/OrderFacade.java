package facadeExample;

public class OrderFacade {
  public void processOrder (String name, int quantity) {
    OrderProcessor processer = new OrderProcessor();
    if(processer.checkStock(name)) {
      String orderID = processer.placeOrder(name, quantity);
      processer.shipOrder("orderID");
    }
  }
}

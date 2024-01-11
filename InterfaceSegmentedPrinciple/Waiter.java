public class Waiter implements WaiterInterface {

  @Override
  public void serveCustomers() {
    System.out.println("Serving customers");
  }

  @Override
  public void takeOrder() {
    System.out.println("Taking order");
  }
}
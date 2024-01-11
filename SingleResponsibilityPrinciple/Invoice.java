public class Invoice {
  private int amount;
  private int gst;

  Invoice(){}

  Invoice(int amount, int gst) {
    this.amount = amount;
    this.gst = gst;
  }

  public long getInvoice(int amount, int gst) {
    return amount + gst;
  }

  /*public void print(String text) {
    System.out.println(text);
  }*/
  // it can't be here as it will bring one more reason for this class to change, i.e. printing funcitonality

  /*public void save(String text) {
    System.out.println("Saving to DB: ");
  }*/
  //it can't be here as it will bring one more reason for this class to change, i.e. saving functionality
}
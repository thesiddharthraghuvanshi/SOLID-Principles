class SqlDao implements InvoiceDao {

  @Override
  public void save(Invoice invoice) {
    System.out.println("Saving to SQL: ");
  }
}
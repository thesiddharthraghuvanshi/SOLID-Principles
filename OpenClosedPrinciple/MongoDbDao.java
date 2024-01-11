class MongoDbDao implements InvoiceDao {

  @Override
  public void save(Invoice invoice) {
    System.out.println("Saving to MongoDB: ");
  }
}
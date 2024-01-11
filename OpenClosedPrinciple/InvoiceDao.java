interface InvoiceDao {
  void save(Invoice invoice);


  /*This class is open for extension, as it has an abstract method save(Invoice invoice) which can be extended by child classes
  but closed for modification
  */
}
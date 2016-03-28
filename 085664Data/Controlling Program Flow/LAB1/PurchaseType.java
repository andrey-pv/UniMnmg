package LAB1;

/**
 * PurchaseType class
 * @author Your Name
 */
class PurchaseType {

  //Saves the price per item
  double price = 0;
  //Saves the quantity of the item being purchased
  int quantity = 0;

  /**
   * Get the cost of the purchase based on quantity and price per item
   * @param None
   * @return The cost of the purchase
   */
  double getCost() {
    return quantity * price;
  }

  /**
   * Get the price per item
   * @param None
   * @return The price per item
   */
  double getPrice() {
    return price;
  }

  /**
   * Get the quantity of the item being purchased
   * @param None
   * @return The quantity of the item
   */
  int getQuantity() {
    return quantity;
  }

  /**
   * Set the quantity and price per item
   * @param quantity The quantity of the item being purchased
   * @param price The price per item
   * @return None
   */
  void setAmounts(int quantity1, double price1) {
    quantity = quantity1;
    price = price1;
  }

}


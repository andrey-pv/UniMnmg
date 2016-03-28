package LAB1;

/**
 * Displays a receipt of purchases and calculates total cost, including a 10% sales tax.
 * @author Your Name
 */
public class CashRegister2 {
  
  /**
   * The starting point for this application.
   * @param args The command-line arguments
   */
  public static void main(String[] args) {

    //Declare an array of purchases
    PurchaseType[] purchases = new PurchaseType[4];
    
    //Assign an instance of the PurchaseType class to each element of the purchases array
    purchases[0] = new PurchaseType();
    purchases[0].setAmounts(8, 1.15);

    purchases[1] = new PurchaseType();
    purchases[1].setAmounts(8, 0.65);
    
    purchases[2] = new PurchaseType();
    purchases[2].setAmounts(6, 0.85);

    purchases[3] = new PurchaseType();
    purchases[3].setAmounts(2, 1.25);

    //Saves the total cost of all purchases
    double subtotal = 0;
    //Saves the total number of items purchased
    int totalItems = 0;
    
    //Display the receipt
    System.out.println("ID  QTY    PRICE   COST");
   
    System.out.println("===================");

    System.out.println("SUBTOTAL:     " + subtotal);

    //Calculate the 10% sales tax by dividing by 10
    double tax = subtotal / 10;
    System.out.println("TAX:          " + tax );
    System.out.println("TOTAL:       $" + (subtotal + tax) );

    //Display the total number of items purchased
    System.out.println("");
    System.out.println("Total items purchased: " + totalItems);

    System.out.println("");
    System.out.println("Thank you for shopping at our store!");
  }

}
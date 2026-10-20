public class Receipt {

  public static void main(String[] args) {
    final double KG_TO_LB = 2.205;

    String name = "Stacey";
    double dozen_apples_price = 0.60;
    double pineapple_price = 3.59;
    double rice_price_per_lb = 1.39;

    double rice_price = rice_price_per_lb * KG_TO_LB;

    int num_of_items = 2 + 1 + 0;

    double total_price =
      (dozen_apples_price * 2) + (pineapple_price * 1) + (rice_price * 0);

    double avg_price_per_item = total_price / num_of_items;

    double cash_tendered = 5.00;

    double change_received = cash_tendered - total_price;

    System.out.println("Customer: " + name);
    System.out.println("Number of items purchased: " + num_of_items);
    System.out.printf("Total price: $%.2f%n", total_price);
    System.out.printf("Average price per item: $%.2f%n", avg_price_per_item);
    System.out.println();
    System.out.printf("Cash tendered: $%.2f%n", cash_tendered);
    System.out.printf("Change received: $%.2f%n", change_received);
  }
}

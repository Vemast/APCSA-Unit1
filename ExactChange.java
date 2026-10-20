import java.util.Scanner;

public class ExactChange {

  public static void main(String[] args) {
    double amount = 0;
    double quarters = .25;
    double dimes = .10;
    double nickels = .5;
    double pennies = .1;
    int count = 0;

    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter an amount in dollars and cents: ");
    amount = scan.nextDouble();
    scan.close();

    if (amount == 0) {
      System.out.println("No change is needed.");
    } else {
      while (amount >= quarters) {
        amount -= quarters;
        count++;
      }
      while (amount >= dimes) {
        amount -= dimes;
        count++;
      }
      while (amount >= nickels) {
        amount -= nickels;
        count++;
      }
      while (amount >= pennies) {
        amount -= pennies;
        count++;
      }
    }

    System.out.println("The minimum number of coins needed: " + count);
  }
}

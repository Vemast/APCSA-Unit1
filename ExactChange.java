import java.util.Scanner;

public class ExactChange {

  public static void main(String[] args) {
    int quarters = 25;
    int dimes = 10;
    int nickels = 5;
    int pennies = 1;

    int count = 0;
    int count_quarters = 0;
    int count_dimes = 0;
    int count_nickels = 0;
    int count_pennies = 0;

    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter an amount in dollars and cents: ");
    double amount = scan.nextDouble();
    scan.close();

    int cents = (int) Math.round(amount * 100);

    if (cents <= 0) {
      System.out.println("No change is needed.");
    } else {
      while (cents >= quarters) {
        cents -= quarters;
        count_quarters++;
        count++;
      }
      while (cents >= dimes) {
        cents -= dimes;
        count_dimes++;
        count++;
      }
      while (cents >= nickels) {
        cents -= nickels;
        count_nickels++;
        count++;
      }
      while (cents >= pennies) {
        cents -= pennies;
        count_pennies++;
        count++;
      }

      System.out.println("The minimum number of coins is: " + count);
      System.out.println(count_quarters + " quarters");
      System.out.println(count_dimes + " dimes");
      System.out.println(count_nickels + " nickels");
      System.out.println(count_pennies + " pennies");
    }
  }
}

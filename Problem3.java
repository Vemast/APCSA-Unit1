import java.util.Scanner;

public class Problem3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter a 3-digit integer: ");
    int number = scan.nextInt();

    int hundreds = number / 100;
    int tens = (number / 10) % 10;
    int ones = number % 10;
    System.out.print(
      "The reverse of " + number + " is: " + ones + "" + tens + "" + hundreds
    );

    scan.close();
  }
}

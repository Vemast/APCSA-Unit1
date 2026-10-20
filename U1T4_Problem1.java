import java.util.Scanner;

public class U1T4_Problem1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = scan.nextLine();
    System.out.println("Welcome, " + firstName);

    System.out.print("Please enter the first integer: ");
    int firstInteger = scan.nextInt();
    System.out.print("Please enter the second integer: ");
    int secondInteger = scan.nextInt();
    System.out.print("Please enter the third integer: ");
    int thirdInteger = scan.nextInt();

    double average = (firstInteger + secondInteger + thirdInteger) / 3.0;

    System.out.print(
      "The average of " +
        firstInteger +
        ", " +
        secondInteger +
        ", and " +
        thirdInteger +
        " is: " +
        average
    );

    scan.close();
  }
}

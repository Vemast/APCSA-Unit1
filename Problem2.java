import java.util.Scanner;

public class Problem2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Player 1, enter your name: ");
    String player1Name = scan.nextLine();
    System.out.print("Enter your number: ");
    double player1Number = scan.nextDouble();
    scan.nextLine();
    System.out.print("Player 2, enter your name: ");
    String player2Name = scan.nextLine();
    System.out.print("Enter your number: ");
    double player2Number = scan.nextDouble();

    if (player1Number > player2Number) {
      System.out.println(player1Name + "'s number is bigger!");
    } else if (player1Number < player2Number) {
      System.out.println(player2Name + "'s number is bigger!");
    } else {
      System.out.println("The numbers are equal!");
    }

    scan.close();
  }
}

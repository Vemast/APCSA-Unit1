import java.util.Scanner;

public class U1T4Lab2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("What is your name: ");
    String name = scan.nextLine();
    System.out.print("Enter an integer: ");
    double num = scan.nextDouble();

    scan.close();

    System.out.println("Hello, " + name + "!");
    System.out.println("You entered: " + num);

    if (num > 0) {
      num++;
      num *= 2;
      num--;
      num /= 3;
    } else {
      num += num;
      num *= 3;
      num -= 20;
    }
    System.out.println("Final value of num: " + num);
  }
}

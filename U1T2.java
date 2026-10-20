public class U1T2 {

  public static void main(String[] args) {
    final double PASSING_GRADE = 65;

    String firstName = "Nihal";
    String lastName = "Masnun";
    double grade = 90;
    int age = 16;
    boolean passing;

    // Introduces student
    System.out.println(
      firstName + " " + lastName + " is " + age + " years old."
    );

    grade = grade - 5; // updating the grade variable
    age = age + 1; // Happy birthday

    if (grade >= PASSING_GRADE) {
      passing = true;
    } else {
      passing = false;
    }

    if (passing == true) {
      System.out.println(firstName + " has a passing grade of " + grade + ".");
    } else {
      System.out.println(firstName + " has a failing grade of " + grade + ".");
    }
  }
}

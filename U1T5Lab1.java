private class U1T5Lab1 {

  public static void main(String[] args) {
    // int someBigPosNum = 2147483600;   // 47 less than max
    // int someBigNegNum = -2147483600;  // 48 greater than min
    // System.out.println("big pos num = " + someBigPosNum);
    // System.out.println("big neg num = " + someBigNegNum);

    // someBigPosNum += 100;  // this will cause the value to exceed max
    // someBigNegNum -= 100;  // this will cause the value to go below min
    // System.out.println("updated big pos num = " + someBigPosNum);
    // System.out.println("updated big neg num = " + someBigNegNum);

    int num1 = -7; // Line 1
    int num2 = 2; // Line 2
    int num3 = 9; // Line 3
    int total = num1 + num2 + num3; // Line 4
    double average = total / 3; // Line 5
    System.out.println("The average is " + average); // Line 6
  }
}

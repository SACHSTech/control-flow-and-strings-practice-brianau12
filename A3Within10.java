class A3Within10 extends ConsoleProgram {

  /**
  * Description: A program that outputs the nearest integer to 10 or 0 if it is a tie
  * @author: B. Au
  */
  
  public void run() {
    
    // declare variables
    int num1;
    int num2;

    // get values
    num1 = readInt("Enter first integer: ");
    num2 = readInt("Enter second integer ");

    // compute
    int diff1 = Math.abs(10 - num1);
    int diff2 = Math.abs(10 - num2);

    // compare
    if (diff1 < diff2) {
      System.out.println("The nearest value to 10 is: " + num1);
    }
    else if (diff1 > diff2) {
      System.out.println("The nearest value to 10 is: " + num2);
    }
    else {
      System.out.println("Numbers are the same, Output = 0 ");
    }
  }
}


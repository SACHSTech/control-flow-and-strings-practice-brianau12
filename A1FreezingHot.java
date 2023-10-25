class A1FreezingHot extends ConsoleProgram {

  /**
  * Description: A program that outputs if integers meet the requirements
  * @author: B. Au
  */
  
  public void run() {
    
    // declare variables
    double Temp1;
    double Temp2;

    // get values
    Temp1 = readDouble("Enter the first temperature: ");
    Temp2 = readDouble("Enter the second temperature: ");

    // compute and print
    System.out.println(((Temp1 < 0 && Temp2 > 100) || (Temp1 > 100 && Temp2 < 0)));
    
  }
}


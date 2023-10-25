class A2HasTeen extends ConsoleProgram {

  /**
  * Description: A program that outputs true if a teen is within age range
  * @author: B. Au
  */
  
  public void run() {
    
    // declare variables
    int Teen1;
    int Teen2;
    int Teen3;

    // get values
    Teen1 = readInt("How old is the first teen ");
    Teen2 = readInt("How old is the second teen ");
    Teen3 = readInt("How old is the third teen ");

    // compute
    System.out.println(((Teen1 >= 13 && Teen1 <= 19) || (Teen2 >= 13 && Teen2 <= 19) || (Teen3 >= 13 && Teen3 <= 19)));
    
  }
}


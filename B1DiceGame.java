import java.util.Random;

class B1DiceGame extends ConsoleProgram {

  /**
  * Description: A program that prints out a phrase if the pair of dice add up to the correlating number
  * @author: B. Au
  */
  
  public void run() {
    
    // create a random object
    Random myRandom = new Random ();  

    // roll 2 dice and add sum
    for (int i = 0; i <= 100; i++); {
        int die1 = myRandom.nextInt(6) + 1;
        int die2 = myRandom.nextInt(6) + 1;
        int sum = die1 + die2;

    // print
    if (sum == 2) {
        System.out.println(" snake eyes! ");
    }
    else if (sum == 7) {
        System.out.println("lucky seven ");
    }
    }
  }
}

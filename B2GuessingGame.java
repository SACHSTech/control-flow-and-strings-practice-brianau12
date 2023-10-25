import java.util.Random;

class B2GuessingGame extends ConsoleProgram {

  /**
  * Description: A program that generates a random number for you to guess
  * @author: B. Au
  */
  
  public void run() {
    

    // generate random number
    Random myRandom = new Random ();
    int secretnumber = myRandom.nextInt(100) + 1;
    int maxattempts = 5;
    int attempts = 0;
    int guess;

    // intro
    System.out.println("It's the guessing game ");
    System.out.println("I have a number between 1 and 100 in mind ");

    guess = readInt("Guess the number: ");

    while (attempts < maxattempts) {
        guess = myRandom.nextInt();
        attempts++;
    
    if (guess < secretnumber) {
        System.out.println("too low, guess again. ");
    }
    else if (guess > secretnumber) {
        System.out.println("too high, guess again. ");
    }
    else {
        System.out.println("Congratulation! You guessed the number! ");
    }
 System.out.println("Nice Try! The secret number was " + (secretnumber));
  }
  
}
}

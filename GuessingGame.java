import java.util.Scanner;
import java.util.Random;
public class GuessingGame
{
  public static void main(String[] args)
  {
    int randomNumber = new Random().nextInt(10);
    System.out.println("My number is " + randomNumber);

    System.out.println("I'm thinking of a number between 0 and 9.");
    
    String guess;
    Scanner keyboard = new Scanner(System.in);

    //infinite loop till the input is correct 
    while (true) 
    {
      System.out.print("What is your guess? ");

      guess = keyboard.nextLine();

      if (guess.length() == 1) {

        if(Character.isDigit(guess)) {
          int modifiedGuess =Character.getNumericValue(guess);
          if (modifiedGuess == randomNumber) 
          {
            System.out.println("Correct!");
            break;
          }
          else if (modifiedGuess > randomNumber)
          {
            System.out.println("Too high");
          }
          else
          {
            System.out.println("Too low");
          }
        }
      else {
        System.out.println("Invalid");
        }
      }
    }

  }
}
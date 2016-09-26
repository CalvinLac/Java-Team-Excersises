import java.util.Scanner;
import java.util.Random;
public class GuessingGame
{
  public static void main(String[] args)
  {
    int randomNumber = new Random().nextInt(10);
    System.out.println("My number is " + randomNumber);

    System.out.println("I'm thinking of a number between 0 and 9.");
    
    int guess = 11;
    Scanner keyboard = new Scanner(System.in);

    while (guess != randomNumber) 
    {
      System.out.print("What is your guess?");
      guess = keyboard.nextInt();
      if (guess == randomNumber) 
      {
        System.out.println("Correct!");
      }
      else if (guess > randomNumber)
      {
        System.out.println("Too high");
      }
      else
      {
        System.out.println("Too low");
      }
    }

  }
}
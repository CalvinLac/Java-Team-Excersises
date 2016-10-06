import java.util.Scanner;
import java.util.Random;

public class guessingGameFinal {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String userNumber;
		int randomNumber = new Random().nextInt(10), numGuesses = 0;
		boolean guess = false;

		System.out.println("I'm thinking of a number between 0 and 9.");

		do {
			System.out.print("Enter a number (0-9): ");
			userNumber = keyboard.nextLine();
			char c = userNumber.charAt(0);
			if (userNumber.length() == 1 && Character.isDigit(c)) {
				numGuesses += 1;
        int parsedInt = Integer.parseInt(userNumber);
				if (parsedInt ==  randomNumber) {
					guess = true;
				} else if (parsedInt > randomNumber) {
					System.out.println("Too big. Try again.");
				} else if (parsedInt < randomNumber) {
					System.out.println("Too small. Try again.");
				}
			} else {
				System.out.println("Invalid guess");
			}
		} while((guess != true) && (numGuesses < 5));

    int parsedInt = Integer.parseInt(userNumber);
    if (parsedInt == randomNumber) {
      System.out.println("Correct.");
    }
    else {
      System.out.println("Too many guesses");    
    }

	}
}
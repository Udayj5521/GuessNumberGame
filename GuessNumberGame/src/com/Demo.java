package com;

import java.util.Random;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		boolean playGame = true;

		while (playGame == true) { // loops the program if the user inputs yes to replay
			Scanner kb = new Scanner(System.in); // creates the scanner for user inputs
			Random random = new Random(); // creates the random generator
			int number = random.nextInt(100) + 1; // generates a random number within 100
			System.out.println("Guess my number ");
			int userNumber = kb.nextInt(); // the user guesses the random number

			while (userNumber != number) { // loops the user until the guess the number correctly
				if (userNumber > number) { // executes if the userNumber is bigger than the random number
					System.out.println("Nope, try again. The number is smaller");
					userNumber = kb.nextInt();
				} else if (userNumber < number) { // executes if the userNumber is smaller than the random number
					System.out.println("Nope, try again. The number is bigger");
					userNumber = kb.nextInt();
				}

				if (userNumber == number) { // decision to reset the game or end the program
					System.out.println("CORRECT!");
					System.out.println("Do you want to play again?");
					String userOption = kb.next();

					if (userOption.equalsIgnoreCase("yes")) { // resets the game if user says yes
						System.out.println("Restarting...");
						continue;
					}

					else { // ends the program if user doesn't say yes
						System.out.println("The End");
						playGame = false;
						kb.close();
					}
				}
			}
		}
	}
}

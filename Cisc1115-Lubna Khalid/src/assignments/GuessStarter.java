package assignments;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

/*
	* Author: Lubna Khalid
	* CISC 1115 - TY11
	* Assignment 2
	* Date Due: 2/14/19
	* Date Submitted: 2/13/19 19:43:23
	* Description: Exercise 3-4.
	* The program chooses a number between 1 and 100, and then the user has to guess the number. 
	* Then the program goes ahead and tells the number it choose, and how close the user was to the answer.
	* The result is sent to a text file after you've typed your number. 
*/
public class GuessStarter {

	public static void main(String[] args) throws Exception
	{
			Scanner in = new Scanner(System.in);
			PrintStream ps = new PrintStream("guess.txt");
			Random random = new Random();
			int number = random.nextInt(100)+1;
			System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
			System.out.print("Type a number: ");
			int guess = in.nextInt();
			ps.println("Your guess is: " + guess);
			ps.println("The number I was thinking of is: " +number);
			ps.println("You were off by: "+ (guess - number));
		

	}

}
/* OUTPUT
 * I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?
 * Type a number: 77
 * shown in the text file: 
 * Your guess is: 77
 * The number I was thinking of is: 32
 * You were off by: 45
*/

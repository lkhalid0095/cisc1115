package classLabs;

import java.util.Scanner;

/*
	* Author: Lubna Khalid
	* CISC 1115 - TY11
	* Date Due: 2/7/19
	* Date Submitted: 2/7/19
	* Description: Lab 2.
*/
		public class ScannerLab
{
				
				
				public static void main(String[] args) 
				{
					Scanner in = new Scanner(System.in);
					int number = 8;
					System.out.println(number);
					int number2; 
					System.out.println("Please enter a number.");
					number2 =in.nextInt();
					System.out.println("The number you entered was "+ number2 + ".");
					 
					
					/*
					 * C. Method B is better because it makes the program abstract. You don't 
					 * have to go back in the program and change it constantly. 
					 */

					int sideSquare;
					System.out.println("What is the number of the inches on the side of a square?");
					sideSquare = in.nextInt();
					System.out.println("The are of the square is "+ (sideSquare*sideSquare)+".");
					in.close();

				}

}
/* OUTPUT:
 * 8
 * Please enter a number.
 * 5
 * The number you entered was 5.
 * What is the number of the inches on the side of a square?
 * 5
 * The are of the square is 25.
 */

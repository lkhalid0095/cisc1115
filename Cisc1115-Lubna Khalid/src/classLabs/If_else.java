package classLabs;

import java.util.Scanner;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 2/21/19
* Date Submitted: 2/21/19
* Description: Lab 8.
*/

public class If_else {
	
	// checks if the input is greater than or less than 5 and prints a statement accordingly.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type in an integer");
		int num = in.nextInt();
		System.out.print("You typed " + num + ".");
		// part a.
		if(num > 5) {
			System.out.println("Your integer is greater than 5. ");
		}
		else {
			System.out.println("Your integer isn't greater than 5.");
		}
		//part b.
		if(num > 5) {
			System.out.println("Your integer is larger than 5.");
		}
		if(num < 5) {
			System.out.println("Your integer is smaller than 5.");
		}
		

	}

}
/*
 * Predictions: 
 * a. You typed 10. Your integer is greater than 5.
 * b. You typed 2. Your integer is smaller than 5.
 * c. You typed 5. Your integer isn't greater than 5.
 * 
 * OUTPUT: 
 * You typed 10.Your integer is greater than 5. 
 * Your integer is larger than 5.
 * You typed 2.Your integer isn't greater than 5.
 * Your integer is smaller than 5.
 * You typed 5. Your integer isn't greater than 5. 
 */


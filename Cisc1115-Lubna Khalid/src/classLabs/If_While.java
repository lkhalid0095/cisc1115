package classLabs;

import java.io.File;
import java.util.Scanner;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 3/14/19
* Date Submitted: 3/14/19
* Description: Lab 14.
*/
public class If_While {

	// prints if the read input is greater or less than 5.
	//if you're not reading from a file, you can ask the user to press CTRL-D to exit the loop.
	//hasNext() is true when there's another token in it's input.
	//hasNextDouble() & hasNextInt() are the 
	public static void main(String[] args) throws Exception {
		double num; 
		Scanner in = new Scanner(new File("grade.txt"));
		
		while(in.hasNextInt()) {
			num = in.nextDouble();
			if(num > 5) {
				System.out.println("The number you entered is greater than five.");
			} else {
				System.out.println("The number you entered is less than five.");
			}
		}
		in.close();


	}

}
/* OUTPUT 
The number you entered is greater than five.
The number you entered is greater than five.
The number you entered is less than five.
The number you entered is less than five.
The number you entered is greater than five.
The number you entered is greater than five.
The number you entered is less than five.
 */

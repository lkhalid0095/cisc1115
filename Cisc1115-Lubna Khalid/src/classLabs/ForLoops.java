package classLabs;

import java.util.Scanner;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 2/28/19
* Date Submitted: 2/28/19
* Description: Lab 11.
*/
public class ForLoops {
	
	// prints value 2 - 12, with the users name next to each number
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		System.out.println("What is your name?");
		name = in.nextLine();
		printValue(name);
		in.close();

	}
	// prints the value with the name and if it's odd or not.
	private static void printValue(String name) {
		int num =0;
		for(int i = 2; i <= 12;i++ ) {
			num = i;
			System.out.printf("%2d"+ " " + "%s", i,name);
			ifOdd(num);
			System.out.println(".");
		}
		
		
	}
	//prints if the value is odd or not.
	private static void ifOdd(int i) {
		
		if(i%2 == 0) {
			System.out.printf("%5s"," Even");
		}
		else {
			System.out.printf("%5s", " Odd");
		}
	}
	

}
/* OUTPUT
What is your name?
Lubna
 2  Lubna Even.
 3  Lubna  Odd.
 4  Lubna Even.
 5  Lubna  Odd.
 6  Lubna Even.
 7  Lubna  Odd.
 8  Lubna Even.
 9  Lubna  Odd.
10  Lubna Even.
11  Lubna  Odd.
12  Lubna Even.
 * 
 */
 
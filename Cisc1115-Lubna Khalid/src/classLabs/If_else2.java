package classLabs;

import java.util.Scanner;
/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 2/21/19
* Date Submitted: 2/21/19
* Description: Lab 8.
*/

public class If_else2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type in a value for x.");
		int x = in.nextInt();
		System.out.println("Type in a value for y.");
		int y = in.nextInt();
		if( x > 0 && y> 0) {
			System.out.println("They are both positive.");
			
		}
		else {
			System.out.println("They are not both positive.");
		}
		if(x> 0 || y > 0) {
			System.out.println("Atleast one is positive.");
		}
		else {
			System.out.println("Neither one is positive.");
		}

	}

}
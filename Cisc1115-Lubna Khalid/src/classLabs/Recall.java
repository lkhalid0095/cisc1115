package classLabs;

import java.util.Scanner;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 2/21/19
* Date Submitted: 2/21/19
* Description: Lab 6.
*/
public class Recall {
	//the main method prints recall if the user types in the year between 1995 -1999 and 	
	//2014-2016, if not it prints safe. 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What year were the phones produced in?");
		int year = in.nextInt();
		if(year >= 1995 && year <= 1999 || year >= 2014 && year <= 2016 ) {
			
			System.out.println("recall");
		}
		else {
			System.out.println("safe");
		}
		in.close();
	}

}
/* OUTPUT
 * What year were the phones produced in?
`* 2000
 * safe
 */
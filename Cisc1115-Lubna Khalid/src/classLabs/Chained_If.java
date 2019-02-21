package classLabs;

import java.util.Scanner;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 2/21/19
* Date Submitted: 2/21/19
* Description: Lab 10.
*/
public class Chained_If {
	
	//prints the vacation, and bonus for each employee based on their salary and 
	// the years they've worked.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter last name: ");
		String last = in.nextLine();
		System.out.println("Enter first name: ");
		String first = in.nextLine();
		System.out.println("Enter years worked: ");
		int year = in.nextInt();
		System.out.println("Enter salary: ");
		int salary = in.nextInt();
		System.out.print(first + " "+last + " gets "); 
		vacationTime(year);
		System.out.print(" week(s) vacation, and a bonus of $");
		bonusReceived(year,salary);
		System.out.println(".");
		in.close();

	}
	// the bonus received based on their salary & how long they worked.
	private static void bonusReceived(int year, int salary) {
		if(year >= 5 && year <= 9 ) {
			System.out.print("200");
		} 
		else if (year >= 10) {
			System.out.print(salary*.05);
		}
		else {
			System.out.print("0");
		}
		
	}

	// vacation time acquired based on how long they've worked. 
	private static void vacationTime(int year) {
		if(year >= 0 && year <= 3) {
			System.out.print("1");
		}
		//correction: you don't need year>= 4 because the first condition already checks that for you. just write year <=6
		//(year>=4 && year <= 6)
		else if(year <= 6){ 
		
			System.out.print("2");
		}
		else if(year >= 7) {
			System.out.print("3");
		}
		
	}


}
/*
 * Enter last name: 
 * Khalid
 * Enter first name: 
 * Lubna
 * Enter years worked: 
 * 5
 * Enter salary: 
 * 200
 * Lubna Khalid gets 2 week(s) vacation, and a bonus of $200.

*/

package classLabs;

import java.util.Scanner;
/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 2/28/19
* Date Submitted: 2/28/19
* Description: Lab 12.
*/
public class LeapYear {
	
	//prints if a year is leap or not.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year;
		boolean leap = false;
		System.out.println("Type in a year");
		year = in.nextInt();
		leap = ifLeap(year,leap);
		if(leap) {
			System.out.println(year + " a leap year!");
		}
		else {
			System.out.println(year + " is not a leap year!");
		}
		in.close();

	}

	private static boolean ifLeap(int year,boolean leap) { 
		leap = year%100 != 0 && year%4 == 0|| year%400 == 0;
		return leap ;
		
	}

}

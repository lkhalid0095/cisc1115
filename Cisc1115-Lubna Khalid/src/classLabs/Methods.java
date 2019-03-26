package classLabs;

import java.util.Scanner;


/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 2/14/19
* Date Submitted: 2/14/19
* Description: Lab 6.
*/
public class Methods {
	
	//asks the user for a name of the book and the price, s
	public static void main(String[] args) {
			 Scanner in = new Scanner(System.in);
			 System.out.println("What is the name of your book?");
			 String name = in.nextLine();
			 System.out.println("What is the price of your book?");
			 double price = in.nextInt();
			 fiftyPercentOff(name,price);
			 in.nextLine();
			 System.out.println("What is the name of your new book?");
			 name = in.nextLine();
			 System.out.println("What is the price of this book?");
			 price = in.nextInt();
			 fiftyPercentOff(name,price);
			in.close();
		

	}
	// prints the fifty percent off price.
	private static void fiftyPercentOff(String name, double price) {
		System.out.println("The name of your book is "+ name + " and your fify percent off sale price is $" + (price*.5));
		
	}


}

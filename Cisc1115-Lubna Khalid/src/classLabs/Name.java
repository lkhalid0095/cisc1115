package classLabs;

import java.util.Scanner;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 4/4/19
* Date Submitted: 4/4/19
* Description: Lab 24.
*/
public class Name {

	// prints fullName in different format
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your full name in either format,"
				+ "First Last or Last, First");
		String fullName = in.nextLine();
		String firstName = "";
		String lastName = "";
		if(fullName.contains(",")) {
			firstName = fullName.substring(0,fullName.indexOf(","));
			lastName = fullName.substring(fullName.indexOf(",")+1);
		} else {
		 firstName = fullName.substring(0,fullName.indexOf(" "));
		 lastName = fullName.substring(fullName.indexOf(" ")+1);
		}
		String firstInitial = firstName.substring(0,1);
		String lastInitial = lastName.substring(0,1);
		System.out.println("Your first name is "+ firstName +". And your last name is "
				+ lastName);
		System.out.println(firstInitial + "."+lastInitial + ".");
		in.close();
	}
	

}

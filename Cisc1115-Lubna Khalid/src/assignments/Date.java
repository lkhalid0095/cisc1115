package assignments;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Assignment 3
* Date Due: 2/19/19
* Date Submitted: 2/19/19 00:26:22
* Description: Exercise 4-3.
* Use parameters and write methods that print the date.
*/

public class Date {
	//main method uses variables as the argument for other methods that have parameters to print the date. 
	public static void main(String[] args) {
		String day = "Monday";
		String month = "February";
		int date = 18;
		int year = 2019;
		System.out.println("American Format:");
		printAmerican(day,month,date,year);
		System.out.println("European Format:");
		printEuropean(day,date,month,year);
		

	}

	//method takes parameters and prints out the date in European format.
	private static void printEuropean(String day, int date, String month, int year) {
		System.out.println(day +", " + date + " " + month +" " + year + "." );
		
	}
	//method takes parameters and prints out the date in American format.
	private static void printAmerican(String day, String month, int date, int year) {
		System.out.println(day +", " + month + " " + date +", " + year + "." );
		
	}
	
	

}

/* OUTPUT
 * American Format:
 * Monday, February 18, 2019.
 * European Format:
 * Monday, 18 February 2019.
 *
 * TRACE:
 * Main 
 * day/Monday; month/February; date/18; year 2019;
 * 
 * HANDCHECK: 
 * The values aren't changed, they stay the same through out the program.
 */

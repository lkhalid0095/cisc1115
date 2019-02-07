package assignments;
/*
 * Author: Lubna Khalid
 * CISC 1115 - TY11
 * Assignment 1
 * Date Due: 2/7/19
 * Date Submitted: 2/6/19 19:56:34
 * Description: The program uses arithmetic operators and variables to find out about time
 * and how it correlates with the 24 hour clock. 
 */
public class Time {

	public static void main(String[] args)
	{
		int startHour = 17;
		int startMin = 12;
		int startSec = 27; 
		double secPassed= startHour* 3600  + startMin*60 + startSec;
		double totalSec = 24 * 3600;
		double percentDay = secPassed/totalSec * 100;
		int currHour = 19;
		int currMin = 14;
		int currSec = 34;
		double currPassed = currHour* 3600  + currMin*60 + currSec;
		double minSpent = (currPassed - secPassed)/60;
		
		
			System.out.println("I started this exercise at " + startHour + ":"+ startMin + ":" +startSec+ ".");
			System.out.println(secPassed + " seconds have passed since midnight.");
			System.out.println( totalSec - secPassed + " seconds remain in the day.");
			System.out.printf("%.2f", percentDay); 
			System.out.println("% of the day has passed.\n");
			System.out.println("The current time is " + currHour + ":"+ currMin + ":" +currSec+ ".");
			System.out.print("I spent about ");
			System.out.printf("%.2f", minSpent);
			System.out.println(" minutes doing this exercise.");
			
	}

}
/*
 * OUTPUT:
 * I started this exercise at 17:12:27.
 * 61947.0 seconds have passed since midnight.
 * 24453.0 seconds remain in the day.
 * 71.70% of the day has passed.
 * 
 * The current time is 19:14:34.
 * I spent about 122.12 minutes doing this exercise.
 */

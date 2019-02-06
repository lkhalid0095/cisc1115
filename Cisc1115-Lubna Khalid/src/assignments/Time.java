package assignments;
/*
 * Name: Time.java
 * Author: Lubna Khalid
 * CISC 1115 - TY11
 * Description: 
 * Assignment 1
 * Date Due: 2/7/19
 * Date Submitted:
 */
public class Time {

	public static void main(String[] args) {
		int hour = 19;
		int minute = 15;
		int second = 20; 
		double secPassed= hour* 3600  + minute*60 + second;
		double totalSec = 24 * 3600;
		System.out.println("The time is " + hour + ":"+ minute + ":" +second+ ".");
		System.out.println("The seconds passed since midnight are "+ secPassed + ".");
		System.out.println( totalSec - secPassed + " seconds remaining in the day.");
		System.out.println((secPassed/totalSec)*100+"% of the day has passed.");
	}

}

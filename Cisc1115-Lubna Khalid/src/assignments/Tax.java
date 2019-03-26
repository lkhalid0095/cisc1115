package assignments;

import java.io.File;
import java.util.Scanner;

/*
 * Author: Lubna Khalid
 * CISC 1115 - TY11
 * Assignment 5
 * Date Due: 3/14/19
 * Date Submitted: 3/18/19 22:55:22
 * Description: A program that calculates the users' tax (in an imaginary world), 
 * based on their income and their relationship status.
 * 
 */
public class Tax {

	//prints the users status, age, annual income and the tax he/she has to pay.
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner (new File ("tax.txt"));
		int status = in.nextInt();
		int birthYear = in.nextInt();
		int currYear = in.nextInt();
		double annualInc = in.nextDouble();
		int age = currYear - birthYear;
		double tax;
		String maritalStatus;
		if(status == 1) {
			 maritalStatus = "single";
			tax = single(annualInc, age);
		}else {
			maritalStatus = "married";
			tax = married(annualInc,age);
		}
		System.out.print("You're "+ maritalStatus + " and " + age + " years old." +
		"\nYour annual income was $" + annualInc + 	" and you were taxed $" + tax + ". ");
		System.out.println(tax >= 2000? "YAY!": "BOO!");
		in.close();

	}
	//if the users' age is atleast sixty, it returns true.
	private static boolean sixty(int age) {
		if(age >= 60 ) {
			return true;
		}
		return false;
	}
	//based on if the user is single, and over sixty or not it calculates the tax for them.
	private static double single(double annualInc, int age) {
		double tax = 0;
		if(annualInc <= 10000) {
			tax = .05* annualInc;
		}else {
			tax = 500 + ((annualInc - 10000)*.1);
			}
		if(sixty(age)) {
			tax-=.1*tax;
		}
		
		return tax;
		}
	//based on if the user is married, and over sixty or not it calculates the tax for them.
	private static double married(double annualInc, int age) {
		double tax = 0;
		if(annualInc <= 10000) {
			tax = 0.06 * annualInc;
		}else {
			tax = 600 + ((annualInc - 10000)*.11);
		}
		if(sixty(age)) {
			tax -= .1*tax;
		}
		return tax;
	}
}

/* OUTPUT
 * You're married and 62 years old.
 * Your annual income was $10400.0 and you were taxed $579.6. BOO!
 */

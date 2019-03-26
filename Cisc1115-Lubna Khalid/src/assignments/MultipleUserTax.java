package assignments;

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

/*
 * Author: Lubna Khalid
 * CISC 1115 - TY11
 * Assignment 6
 * Date Due: 3/21/19
 * Date Submitted: 3/21/19 02:55:22
 * Description: A program that calculates multiple users' tax (in an imaginary world), 
 * based on their income and their relationship status.
 * 
 */
public class MultipleUserTax {
	//prints the status,income,tax and message for each user.
	//gives a summary based on the values that were read. 
	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream ("output.txt");
		Scanner in = new Scanner (new File ("taxes.txt"));
		double married = 0;
		double single = 0;
		double users = 0;
		double totalTax = 0;
		double tax = 0;
		ps.printf("%-8s %-9s %-8s %-11s\n", "Status", "Income","Tax", "Message");
		while(in.hasNextInt()) {
			int status = in.nextInt();
			int birthYear = in.nextInt();
			int currYear = in.nextInt();
			double annualInc = in.nextDouble();
			int age = currYear - birthYear;
			String maritalStatus;
			if(status == 1) {
			maritalStatus = "single";
			tax = single(annualInc, age);
			single++;
			totalTax += tax;
			}else {
			maritalStatus = "married";
			tax = married(annualInc,age);
			married++;
			}
			users++;
			ps.printf("%-7s %,10.2f %,8.2f %-6s\n", maritalStatus,annualInc,tax, tax>=2000? "YAY!":"BOO" );
			}
		in.close();
		double perMarried = percentMarried(users,married);
		double averageSingle = averageSingle(totalTax, single);
		double highestTax = highestTaxPaid(tax);
		ps.printf("%.2f%% of the users are married.\n", perMarried);
		ps.printf("%.2f is the average tax paid by single users.\n", averageSingle);
		ps.printf("The highest tax paid by anybody is %.2f.\n", highestTax);
	}
	//returns the highest tax paid
	private static double highestTaxPaid(double tax) {
		double highest = 0;
		if(highest < tax) {
			highest = tax;
		}
		return highest;
	}
	//returns the average tax paid by the single users.
	private static double averageSingle(double totalTax, double single) {
		double average = totalTax/single;
		return average;
	}
	//returns the percent of of the users married.
	private static double percentMarried(double users, double married) {
		double percent = married/users;
		percent *= 100;
		return percent;
		
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
/*
 * OUTPUT
Status   Income    Tax      Message    
married  10,400.00   579.60 BOO   
single   11,340.00   570.60 BOO   
single    8,500.00   425.00 BOO   
married   5,400.00   324.00 BOO   
single    2,400.00   120.00 BOO   
married   8,400.00   453.60 BOO   
single    9,340.00   420.30 BOO   
married  40,400.00 3,549.60 YAY!  
50.00% of the users are married.
383.97 is the average tax paid by single users.
The highest tax paid by anybody is 3549.60.

 */

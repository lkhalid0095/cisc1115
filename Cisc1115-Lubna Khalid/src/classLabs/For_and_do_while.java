package classLabs;

import java.util.Scanner;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 3/21/19
* Date Submitted: 3/21/19
* Description: Lab 15.
*/
public class For_and_do_while {
	//asks the user for an integer from 1 to 1000 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//System.out.println("Enter an integer between 1 and 1000.");
		int num = 0;
		do {
			System.out.println("Enter a valid input between 1 and 1000.");
			num = in.nextInt();
		}while (num < 1 || num > 1000);
		
		int count = 0;
		divNum(num,count);
		int divisor = askUser(in);
		System.out.println(divisor + " " + divisibility(num,divisor));
		
	}

	//asks User for divisors 
	private static int askUser(Scanner in) {
		int divisor = 0;
		System.out.println();
		System.out.println("Enter the integers by which you want to divide.");
		divisor = in.nextInt();
		return divisor;
		
	}

	//returns true if the number is divisible 
	private static boolean divisibility(int num, int divisor) {
		
			if(num % divisor == 0) {
				return true;
			}
		return false;
	}

	//prints the nums divisible by 5 & 6, 
	//the limit being the number user entered.
	private static void divNum(int num, int count) {
		for(int i = 0; i<num;i++) {
			if(i%5 == 0 && i%6 ==0) {
				count++;
				System.out.print(count == 11? "\n":" "+i);
				
			}
			
		}

		
	}

}

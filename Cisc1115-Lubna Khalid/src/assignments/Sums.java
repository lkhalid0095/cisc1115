package assignments;

import java.util.Scanner;
/*
 * Author: Lubna Khalid
 * CISC 1115 - TY11
 * Assignment 7
 * Date Due: 3/28/19
 * Date Submitted: 3/28/19 04:15:23
 * Description: A program that calculates multiple algorithms
 * of sums based on the users input of 'n'.
 * 
 */
public class Sums {
	
	//prints the sum of the first n cubes in three ways
	//fourth result is the sum of the first n squares.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type an integer you want"
				+ " to find the sums of.");
		int n = in.nextInt();
		System.out.println("You typed in " + n + ".");
		double sum1 = sum1(n);
		double sum2 = sum2(n);
		double sum3 = sum3(n);
		double sum4 = (n*((n+1)*(2*n+1)))/(4+2);
		System.out.println("Sum 1 is " + sum1);
		System.out.println("Sum 2 is " + sum2);
		System.out.println("Sum 3 is " + sum3);
		System.out.println("Sum 4 is " + sum4);
		if(compare(sum1,sum2)) {
			System.out.println("The two sums are the same.");
		}else {
			System.out.println("The two sums aren't equal.");
		}
		if(compare(sum2,sum3)) {
			System.out.println("The two sums are the same.");
		}else {
			System.out.println("The two sums aren't equal.");
		}
		if(compare(sum3,sum4)) {
			System.out.println("The two sums are the same.");
		}else {
			System.out.println("The two sums aren't equal.");
		}
		in.close();

	}
	//compares the two values
	private static boolean compare(double sum, double sum1) {
		if(sum == sum1) {
			
			return true;
		}
		return false;
	}
	//computes sum using the third algorithm
	private static double sum3(int n) {
		double num = 0;
		double sum = 0;
		for(int i =1; i <= n; i++) {
			num+= i;
		}
		sum = Math.pow(num, 2);
		return sum;
		
	}
	//computes sum using the second algorithm
	private static double sum2(int n) {
		double sum = 0;
		sum = (Math.pow(n,2)*(Math.pow(n+1,2)))/4;
		return sum;
		
	}
	//computes sum using the first algorithm
	private static double sum1(int n) {
		double sum = 0;
		for(int i= 1; i<=n;i++) {
			sum += Math.pow(i, 3);
		}
		return sum;
	}

}
/* OUTPUT
Type an integer you want to find the sum of the first cubes of.
5
You typed in 5.
Sum 1 is 225.0
Sum 2 is 225.0
Sum 3 is 225.0
Sum 4 is 55.0
The two sums are the same.
The two sums are the same.
The two sums aren't equal.
 *
Type an integer you want to find the sum of the first cubes of.
7
You typed in 7.
Sum 1 is 784.0
Sum 2 is 784.0
Sum 3 is 784.0
Sum 4 is 140.0
The two sums are the same.
The two sums are the same.
The two sums aren't equal.
 */

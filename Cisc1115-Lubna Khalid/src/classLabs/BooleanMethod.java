package classLabs;

import java.util.Scanner;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 2/28/19
* Date Submitted: 2/28/19
* Description: Lab 13.
*/
public class BooleanMethod {
	
	//prints out if the food meets the guidelines.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double cal; 
		double fat;
		System.out.println("Enter the calories in your food.");
		cal = in.nextInt();
		System.out.println("Enter the number of grams of fat in the food.");
		fat = in.nextInt()/9.0;

		if(ifRecommend(cal,fat)){
			System.out.println("Food is recommended.");
		}
		else {
			System.out.println("Food isn't recommended.");
		}
		in.close();

	}
	//if the food contains the recommended amount of fat
	private static boolean ifRecommend(double cal, double fat) {
		
		boolean ifMet = false;
		if(fat <= .3*cal) {
			ifMet = true;
			
		}
		return ifMet;
		
		
	}
}
/*
   	OUTPUT
	Enter the calories in your food.
	54
	Enter the number of grams of fat in the food.
	23
	Food is recommended.

 */

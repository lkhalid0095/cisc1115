package classLabs;
/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 1/31/19
* Date Submitted: 1/31/19
* Description: Lab 1.
*/
public class Variables {
	

	public static void main(String[] args) {
		int a = 25;
		int b = -3;
		int c = 1;
		System.out.println(a + "\n" +b+c);
		
		System.out.println(b + " "+ c + " "+ a + " ");

		System.out.println(a+b+c + " " + a*b );
	}
	/*
	 * a. Invalid, ints isn't a type.
	 * b. Valid 
	 * c. Invalid, should add semicolons at the end of each variable.
	 * d. Valid
	 * e. Invalid, add semicolons
	 * f. Valid, same as d. The comments don't change anything.
	 */

}
/*
 * output:
 * 25
 * -31
 * -3 1 25
 * 23 -75
 */
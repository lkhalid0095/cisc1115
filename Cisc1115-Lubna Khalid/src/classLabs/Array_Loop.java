package classLabs;
/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 3/26/19
* Date Submitted: 3/26/19
* Description: Lab 18.
*/
public class Array_Loop {
	
	//creates an array and prints it out using a loop,
	// and without a loop.
	public static void main(String[] args) {
		int SIZE = 3;
		int[] arr = new int[SIZE];
		noLoopPrint(arr);
		loopPrint();

	}
	//prints the array using an array.
	private static void loopPrint() {
		int []arr = {2,3,4};
		for(int i=0; i<3; i++){
			System.out.println(arr[i]);
		}
		
	}
	//prints an array without a loop.
	private static void noLoopPrint(int[] arr) {
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
	}
	// I wouldn't be willing to mention each item one by one.
	//100 items would be too much to write out. 

}
/* OUTPUT
 * 2
 * 3
 * 4
 * 2
 * 3
 * 4
 */

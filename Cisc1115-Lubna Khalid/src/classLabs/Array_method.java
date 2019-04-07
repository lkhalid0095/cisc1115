package classLabs;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 3/28/19
* Date Submitted: 3/28/19
* Description: Lab 19.
*/
public class Array_method {

	//prints the array, the product, the sum, and
	//the average.
	
	public static void main(String[] args) throws Exception {
		int SIZE = 5;
		double count = 0;
		int[] arr = new int[SIZE];
		count = howMany(arr,SIZE);
		System.out.println(Arrays.toString(arr));
		double product = prodArr(arr,count);
		System.out.println("The product of the array is " + product);
		double average = averageArr(arr,count);
		System.out.println("The average of the array is " + average);

	}
	
	//returns the average of the array
	//prints the sum
	private static double averageArr(int[] arr,double count) {
		double sum = sumArr(arr,count);
		double average = 0;
		average = sum/count;

		System.out.println("The sum of the array is " + sum);
		return average;
	}
	
	//returns the sum of the array
	private static double sumArr(int[] arr, double count) {
		double sum = 0;
		for (int i = 0; i<count; i++) {
			sum+= arr[i];
		}
		return sum;
		
	}

	//returns the product of the array.
	private static double prodArr(int[] arr, double count) {
		double product = 1;
		for(int i =0; i < count; i++) {
			product *= arr[i];
		}
		return product;
	}
	
	//returns how many elements in the array.
	//reads the values from the file.
	private static int howMany(int[] arr, int SIZE) throws Exception {
		int count = 0;
		Scanner in = new Scanner(new File("values.txt"));
		while(count< SIZE && in.hasNextInt()) {
			arr[count] = in.nextInt();
			count++;
		}
		in.close();
		return count;
	}
}
/* OUTPUT
[3, 4, 4, 3, 0]
The product of the array is 144
The sum of the array is 14
The average of the array is 3.5
 */

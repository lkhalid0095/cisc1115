package assignments;
import java.io.File;
import java.util.Scanner;
/*
 * Author: Lubna Khalid
 * CISC 1115 - TY11
 * Assignment 8
 * Date Due: 4/9/19
 * Date Submitted: 4/11/19 02:15:23
 * Description:
 * 
 */
public class Array {
	
	final static int SIZE = 100;
	
	// calls on methods to print array and count zeroes.
	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(new File("file1.txt"));
		int n = 0;
		int[] arr = new int[SIZE];
		n = readData(in,n,arr);
		printData(arr,n);
		int count = countZeros(arr,n);
		System.out.println("There are " + count + " number of zero values.");
		n = append(arr, n, in);
		printData(arr,n);
		count = countZeros(arr,n);
		System.out.println("The new number of zeros are " + count + ".");
		in.close();
		

	}
	
	// reads in new values until input failure, returns updated n
	private static int append(int[] arr, int n, Scanner in) {
		while(n<SIZE && in.hasNextInt()) {
			arr[n] = in.nextInt();
			n++;
			
		}
		return n;
	}
	
	// counts zeroes in the given array
	private static int countZeros(int[] arr, int n) {
		int count = 0;
		for(int i = 0; i<n;i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		return count;
	}
	
	// prints the value of the first n elements of the array
	private static void printData(int[] arr, int n) {
		for(int i =0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//reads the data into an array and returns n.
	public static int readData(Scanner in, int n ,int[] arr) {
		n = in.nextInt();
		int count = 0;
		while(n < SIZE && count<n && in.hasNextInt()) {
				arr[count] = in.nextInt();
				count++;
				
		}
		return n;
	}

}
/*
 OUTPUT 1:
 49 5 0 4 0 93 
 There are 2 number of zero values.
 49 5 0 4 0 93 0 43 0 54 
 The new number of zeros are 4.

 OUTPUT 2:
 4 4 3 
 There are 0 number of zero values.
 4 4 3 4 5 
 The new number of zeros are 0.

 */

package classLabs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 4/4/19
* Date Submitted: 4/4/19
* Description: Lab 23.
*/
public class BubbleSortB {

	final static int n = 20;
	// bubble sort algorithm
	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(new File("file1.txt"));
		int[] numb = new int[n];
		int count = 0;
		count = bubbleSort(numb,count,in);
		in.close();
		System.out.println(Arrays.toString(numb));
	}

	// bubble sort algorithm.
	private static int bubbleSort(int[] numb, int count, Scanner in) {
		int pass = 0;
		while(in.hasNextInt() && count < n) {
				numb[count] = in.nextInt();
				count++;
		}
		boolean swapped = false;
		do {
			pass++;
			swapped = false;
			for (int pos = 0; pos < n - pass; pos++)
			if (numb[pos] > numb[pos+1]) {
			int temp = numb[pos];
			numb[pos] = numb[pos+1];
			numb[pos+1] = temp;
			swapped = true;
			}
			} while(swapped);
		return count;
	}
	

}
/** OUTPUT 
 * [-12, 0, 0, 0, 0, 1, 2, 4, 4, 5, 6, 34, 43, 45, 45, 49, 54, 87, 93, 565]
 */

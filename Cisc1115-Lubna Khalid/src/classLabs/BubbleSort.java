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
public class BubbleSort {

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
			} while(swapped == true);
		return count;
	}
	

}
/** LAB ANSWERS: 
 * 1a. If we omitted line 38 then it would just sort
 * the first element in the array, and then never 
 * execute the while loop.
 * b. Nothing changes, it means the same thing.
 * c. you're not changing the index of the array but
 * just adding to the element at the same position.
 * d. Since you don't have a place holder you aren't 
 * swapping but just assigning num[pos] to 
 * num[pos+1] so at the end both end up with the same values.
 * e. By not initializing it to false we risk our arrays that 
 * are already half sorted to not be completely sorted 
 * because it never goes through the whole array.
 * f. If we add an else statement than once that else 
 * statement has been executed than it would leave the loop,
 * never truly going through the whole array. 
 */

package classLabs;

import java.util.Arrays;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 4/4/19
* Date Submitted: 4/4/19
* Description: Lab 20.
*/

public class Array_reverse_odd {

	public static void main(String[] args) {
		int SIZE = 25;
		//int NEWSIZE = 5;
		int num = 0;
		int[] arr = new int[SIZE];
		int[] reverse = new int [SIZE];
		int count = 0;
		boolean[] divSeven = new boolean[SIZE];
		
		for(int i = 0; i<SIZE*2; i++) {
			if(count < 25 && i%2 != 0) {
				arr[count] = i;
				count++;
			}
		}
		for(int i = 0; i < SIZE; i++) {
			if(arr[i]%5 == 0) {
				reverse[num] += arr[i] ;
				num++;
				
			} 
		}
		for(int i = num-1;i>=0;i--) {
			System.out.println(reverse[i]);
		}
		for(int i = 0; i< SIZE; i++) {
			if(arr[i]%7 == 0) {
				divSeven[i] = true;
			}
		}

		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(reverse));
		System.out.println(Arrays.toString(divSeven));
	}

}

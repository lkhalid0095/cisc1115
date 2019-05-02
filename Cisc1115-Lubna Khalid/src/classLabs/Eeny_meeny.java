package classLabs;

import java.util.Arrays;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 4/4/19
* Date Submitted: 4/4/19
* Description: Lab 21.
*/
public class Eeny_meeny {

	public static void main(String[] args) {
		int SIZE = 20;
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17
				,18,19,20}; 
		int pos = SIZE-1;
		System.out.println("The total number of children "
				+ "are " + SIZE);
		for(int i=0;i < SIZE; i++) {
			while(pos>0) {
				arr[pos] = 0;
				pos--;
				
			}
		}
		System.out.println("Child #"+ arr[pos] + " is left.");
		//System.out.println(Arrays.toString(arr));

	}

}

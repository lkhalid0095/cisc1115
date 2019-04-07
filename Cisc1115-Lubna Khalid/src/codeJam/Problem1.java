package codeJam;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = 0;
		System.out.println("Please enter a value greater than one "
				+ "and less than 100.");
		num = in.nextInt();
		

		System.out.println(num);
		int[]arr = findDig(num);
		boolean contain = contains4(arr);
		System.out.println(contain);
		divTwo(arr,num);
		long startTime = System.nanoTime();
		//code
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		in.close();

	}



	private static void divTwo(int[] arr, int num) {
		int num1 = 0;
		int num2 = 0;
		while(contains4(arr)) {
			num1 = num/2;
			//if(contains4(findDig(num1))) {
			//	for(int high = num1; high 
			//}
		}
		
	}



	private static boolean contains4(int[] arr) {
		boolean cont = false;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == 4) {
				cont = true;
			}
		}
		return cont;
		
	}



	private static int[] findDig(int num) {
		int[] arr = new int[String.valueOf(num).length()];
		int length = String.valueOf(num).length();
		for(int i = 0; i < length;i++) {
			arr[i] += num % 10;
			num/=10;
		}
		return arr;	
	}

}

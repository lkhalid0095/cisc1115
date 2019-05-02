package classLabs;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	
	final static int SIZE = 100;
	
	// calls on methods, reads, combine arrays, and compute avg
	public static void main(String[] args) throws Exception {
		int[] arr1= new int[SIZE];
		int[] arr2 = new int [SIZE];
		int count1 = populate1(arr1);
		int count2 = populate2(arr2);
		int[]arr3 = combine(arr1,arr2,count1,count2);
		double avg = average(arr3);
		System.out.println(Arrays.toString(arr3));
		System.out.printf("The average is %.1f.",avg);
	}

	// returns average
	private static double average(int[] arr3) {
		double avg = (arr3[0]+ arr3[arr3.length-1])/2;
		return avg;
	}

	// combines two arrays
	private static int[] combine(int[] arr, int[] arr2, int x, int y) {
		int[] arr3 = new int[x+y];
		int count = 0;
		while(count<x) {
			arr3[count] = arr[count];
			count++;
		}
		int i = 0;
		while(count < (x+y) && i<y) {
			arr3[count] = arr2[i];
			count++;
			i++;
		}
		return arr3;
	}

	// populates second file put them in array2
	private static int populate2(int[] arr) throws Exception{
		int count = 0;
		Scanner sc = new Scanner(new File("two.txt"));
		while(sc.hasNextInt() && count <SIZE) {
			arr[count] = sc.nextInt();
			count++;
		}
		sc.close();
		return count;
	}

	// populates first file put them in an array
	private static int populate1(int[] arr) throws Exception {
		int count = 0;
		Scanner in = new Scanner(new File("one.txt"));
		while(in.hasNextInt() && count <SIZE) {
			arr[count] = in.nextInt();
			count++;
		}
		in.close();
		return count;
	}

}

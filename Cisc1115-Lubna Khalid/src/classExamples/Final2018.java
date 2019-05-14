package classExamples;

import java.io.File;
import java.util.Scanner;

public class Final2018 {

	final static int SIZE = 100;
	//reads input from files to array, modifies array
	public static void main(String[] args) throws Exception {
	    	Scanner in = new Scanner(new File("input.txt"));
	    	double[] arr1 = new double[SIZE];
	    	double[] arr2 = new double[SIZE];
	    	int num = readData(arr1,arr2,in);
	    	changeArray(arr1,arr2,num);
	    	sortArray(arr1,num);
	    	sortArray(arr2,num);
	    	System.out.printf("%8s %6s\n", "arr1","arr2");
	    	for(int i = 0;i<num; i++) {
	    		System.out.printf("%8.2f %6.2f \n",arr1[i],arr2[i]);
	    
	    	}
	}
	
	// sorts array
	private static void sortArray(double[] arrToOrder, int k) {
		int pass = 0;
		boolean swapped = false;
		do {
			pass++;
			swapped = false;
			for(int i =0; i< k-pass; i++ ) {
				if(arrToOrder[i]> arrToOrder[i+1]) {
				double temp = arrToOrder[i] ;
				arrToOrder[i] = arrToOrder[i+1]; 
				arrToOrder[i+1] = temp;
				swapped = true;
				}
			}
		}while(swapped); 
	}
	// modifies the array
	private static void changeArray(double[] beta, double[] alpha, int k) {
		for(int i = 0;i< k; i++) {
			beta[i] = beta[i]*alpha[i];
		}
	}
	// reads data into array, and populate
	private static int readData(double[] arrOne, double[] arrTwo, Scanner in) throws Exception {
		int count = 0;
		while(count<SIZE && in.hasNextLine()) {
			String input = in.nextLine();
			arrOne[count] = Double.parseDouble(input.substring(0, input.indexOf(" ")));
			arrTwo[count] = Double.parseDouble(input.substring(input.indexOf(" ")+1));
			count++;
		}
		return count;
	}

}

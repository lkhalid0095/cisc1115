package classExamples;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Names {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner sc = new Scanner(new File ("names.txt"));
		
		//Array for full names
		String [] full = new String[15];
		
		//Array for first names only
		String [] first = new String[15];
		
		//Array for last names only
		String [] last = new String[15];
		
		int i = 0;
		while(sc.hasNext()){
			first[i] = sc.next();
			last[i] = sc.next();
			i++;
		}
		readFullNameArray(full, first, last, i);
		
		printLastFirstName(full, i);
		
		printFirstLastName(full, i);
		
		
		printLastName(last, i);
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter last name (don't forget to press enter):");
		
		String userLastName = keyboard.next();
		
		isLastNameInArr(last, userLastName, i);
		
		//bubbleSort(last);
		
		/*System.out.println("");
		
		//print array after sorting using bubble sort algorithm
		System.out.println("\nArray After Bubble Sort");
		for(int j =0; j < last.length; j++){
			System.out.print(last[i] + " ");
		}
		*/
		
	}
	
	public static void readFullNameArray(String [] full, String [] first, String [] last, int i){
		System.out.print("First  Last| ");
		for(int j = 0; j < i; j++){
			
			//Combines the first and last name 
			full[j] = first[j] + " " + last[j];
			
			//Print name in "First Last" format
			System.out.printf("%-20s ", full[j]);
			
		}
		System.out.print("\n");
			
	}
	public static void printLastFirstName(String [] full, int i){
		System.out.print("Last, First| ");
		for(int j = 0; j < i; j++){
			
			//Finds the space in the name
			int index = full[j].indexOf(' ');
			
			//The length of each name in the array
			int index2 = full[j].length();
			
			//Reads the first names of each name in the array
			String s1 = full[j].substring(0, index);
			
			//Reads the last names of the each name in the array
			String s2 = full[j].substring(index + 1, index2);
			
			//Reads the name in "Last, First" format
			String s = s2 + "," + s1;
			
			//Prints the name
			System.out.printf("%-20s ", s);
		}
		System.out.print("\n");
	}
	public static void printFirstLastName(String [] full, int i){
		System.out.print("First--Last| ");
		for(int j = 0; j < i; j++){
			
			//Locates the last index of the first name
			int index = full[j].indexOf(' ');
			
			//The length of each name in array
			int index2 = full[j].length();
			
			//Reads the first names of each name in the array
			String s1 = full[j].substring(0, index);
			
			//Reads the last names of the each name in the array
			String s2 = full[j].substring(index + 1, index2);
			
			//Reads the name in "First---Last" format
			String s = s1 + "--" + s2;
			
			//Prints the name
			System.out.printf("%-20s ", s);
			
		}
	}
	public static void printLastName(String [] last, int i){
		
		//Print the values into the arrays
		System.out.print("\n\nlast name {" + last[0]);
	    for (int j = 1; j < i; j++) {
	        System.out.print(", " + last[j]);
	    }
	    
	    System.out.println("}");
	}
	
	
	public static void isLastNameInArr(String [] last, String userLastName, int i){
		
		boolean k = false;
		for(int j = 0; j < i; j++){
			if(last[j].equalsIgnoreCase(userLastName)){
				k = true;
			} 
		}
		if(k == true){
			System.out.printf("Yes, %s is in the array", userLastName);
		} else {
			System.out.printf("No, %s is not in the array", userLastName);
		}
		
	}
	/*public static void bubbleSort(String[] intArray) {
		
		int n = intArray.length;
		String temp;
		
		for(int i=0; i < n; i++){
			for(int j=1; j < (n-i); j++){
				
				if(intArray[j-1].compareTo(intArray[j]) < 0){
					//swap the elements!
					temp = intArray[j-1];
					intArray[j-1] = intArray[j];
					intArray[j] = temp;
				}
				
			}
		}
	
	}
	*/

}





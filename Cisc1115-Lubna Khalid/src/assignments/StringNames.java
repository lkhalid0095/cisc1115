package assignments;

import java.io.File;
import java.util.Scanner;

/*
 * Author: Lubna Khalid
 * CISC 1115 - TY11
 * Assignment 9
 * Date Due: 5/1/19
 * Date Submitted: 5/7/19 02:15:23
 * Description: Uses string methods create an alphabetical array of names.
 * Also checks if the certain last name is in the list.
 * 
 */
/* Potential Errors/questions: 
 * She said to print the row, she means it for every name?
 * The issue with size, she said it should contain 15 but asks for 5, that gives me an error.
 * How do I fix that? :(
 * The contains is case sensitive, does that matter? 
 * 
 */
 
public class StringNames {
	final static int SIZE = 15; //if i change the size to 15 it gives me an error? 
	
	// prints name in three different ways, prints a list of names alphabetically
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		printTable();
		String[] names = new String[SIZE] ; 
		nameArray(names);
		String first = "";
		String last = "";
		String dashName = "";
		String[] lastNames = new String[SIZE];
		for(int i =0;i<SIZE; i++) {
			first = names[i].substring(0, names[i].indexOf(" "));
			last = names[i].substring(names[i].indexOf(" ")+1);
			lastNames[i] = last;
			dashName = printName(first,last);
			printRow(first,last,dashName);
			
		}
		System.out.println("\nThe list of the last names in the list are:");
		printArray(lastNames);
		System.out.println("\nEnter a last name to see if it's in the list. ");
		String str = sc.next();
		if(findLast(str,lastNames)) {
			System.out.println("We found a match in the list!");
		}else {
			System.out.println("Sorry, we didn't find a matching name in the list.");
		}
		System.out.println("\nThe list in alphabetical order is: ");
		bubbleSort(lastNames);
		printArray(lastNames);
		sc.close();
	}

	// sorts array of last names in a non ascending order. (alphabetical order)
	private static void bubbleSort(String[] lastNames) {
		int pass = 0;
		boolean swapped = false;
		do {
			pass++;
			swapped = false;
			for (int pos = 0; pos < SIZE- pass; pos++)
			if (lastNames[pos].compareTo(lastNames[pos+1]) > 0) {
			String temp = lastNames[pos];
			lastNames[pos] = lastNames[pos+1];
			lastNames[pos+1] = temp;
			swapped = true;
			}
			} while(swapped == true);
	}
	
	// determines if last name is in the array.
	private static boolean findLast(String str, String[] lastNames) {
		for(int i = 0;i<SIZE;i++) {
			if(lastNames[i].contains(str)) {
				return true;
			}
		}
		return false;
	}

	// prints array of last names
	private static void printArray(String[] lastNames) {
		for(int i =0;i<SIZE;i++) {
			System.out.println(lastNames[i]);
		}
	}

	// prints row in the chart with "first last", "last,first","first--last"
	private static void printRow(String first, String last, String dashName) {
		System.out.printf("%-10s %-11s\t%-10s,%-10s \t %s \n",first,last,first,last,dashName);
	}

	// prints first---last 
	private static String printName(String first, String last) {
		String dash = first+"---"+last;
		return dash;
	}

	// read full names into an array
	private static void nameArray(String[] names) throws Exception {
		int count = 0;
		Scanner in = new Scanner(new File("names.txt"));
		while(in.hasNext()&& count< SIZE) {
			for(int i =0; i< SIZE;i++) {
				names[i] = in.nextLine();
				count++;
			}
		}
		in.close();
	}

	// prints heading of table
	private static void printTable() {
		System.out.println("\t\tList of People\t");
		
	}

}
/** OUTPUT
 	List of People
Stephanie  Guerrero   	Stephanie ,Guerrero   	 Stephanie---Guerrero 
Kaitlyn    Cao        	Kaitlyn   ,Cao        	 Kaitlyn---Cao 
Jorge      Garcia     	Jorge     ,Garcia     	 Jorge---Garcia 
Aarfa      Aftab      	Aarfa     ,Aftab      	 Aarfa---Aftab 
Jane       Feng       	Jane      ,Feng       	 Jane---Feng 

The list of the last names in the list are:
Guerrero
Cao
Garcia
Aftab
Feng
Enter a last name to see if it's in the list. 
fagn
Sorry, we didn't find a matching name in the list.

The list in alphabetical order is: 
Aftab
Cao
Feng
Garcia
Guerrero
 */
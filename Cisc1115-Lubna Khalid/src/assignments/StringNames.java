package assignments;


import java.io.File;
import java.util.Scanner;

/*
 * Author: Lubna Khalid
 * CISC 1115 - TY11
 * Assignment 9
 * Date Due: 5/1/19
 * Date Submitted: 5/4/19 16:26:23
 * Description: Uses string methods create an alphabetical array of names.
 * Also checks if the certain last name is in the list.
 * 
 */

public class StringNames {
 final static int SIZE = 15; 
 
 // prints name in three different ways, prints a list of names alphabetically
 public static void main(String[] args) throws Exception {
  
  Scanner sc = new Scanner(System.in);
  printTable();
  String[] names = new String[SIZE] ; 
  int count = nameArray(names);
  String first = "";
  String last = "";
  String dashName = "";
  String[] lastNames = new String[count];
  for(int i =0;i<count; i++) {
   first = names[i].substring(0, names[i].indexOf(" "));
   last = names[i].substring(names[i].indexOf(" ")+1);
   lastNames[i] = last;
   dashName = printName(first,last);
   printRow(first,last,dashName);
   
  }
  System.out.println("\nThe list of the last names in the list are:");
  printArray(lastNames,count);
  System.out.println("\nEnter a last name to see if it's in the list. ");
  String str = sc.next();
  str = str.toLowerCase();
  if(findLast(str,lastNames,count)) {
   System.out.println("We found a match in the list!");
  }else {
   System.out.println("Sorry, we didn't find a matching name in the list.");
  }
  System.out.println("\nThe list in alphabetical order is: ");
  bubbleSort(lastNames,count);
  printArray(lastNames,count);
  sc.close();
 }

 // sorts array of last names in a non ascending order. (alphabetical order)
 private static void bubbleSort(String[] lastNames, int count) {
  int pass = 0;
  boolean swapped = false;
  do {
   pass++;
   swapped = false;
   for (int pos = 0; pos < count- pass; pos++)
   if (lastNames[pos].compareTo(lastNames[pos+1]) > 0) {
   String temp = lastNames[pos];
   lastNames[pos] = lastNames[pos+1];
   lastNames[pos+1] = temp;
   swapped = true;
   }
   } while(swapped == true);
 }
 
 // determines if last name is in the array.
 private static boolean findLast(String str, String[] lastNames, int count) {
  for(int i = 0;i<count;i++) { 
	 if((lastNames[i].toLowerCase().contains(str))){
			return true;
		 }
	  } return false;
 }

 // prints array of last names
 private static void printArray(String[] lastNames, int count) {
  for(int i =0;i<count;i++) {
   System.out.println(lastNames[i]);
  }
 }

 // prints row in the chart with "first last", "last,first","first--last"
 private static void printRow(String first, String last, String dashName) {
  System.out.printf("%s %s\t%s, %s \t %s \n",first,last,last,first,dashName);
 }

 // prints first---last 
 private static String printName(String first, String last) {
  String dash = first+"---"+last;
  return dash;
 }

 // read full names into an array
 private static int nameArray(String[] names) throws Exception {
  int count = 0;
  Scanner in = new Scanner(new File("names.txt"));
  while(in.hasNext()&& count< SIZE) {
    names[count] = in.nextLine();
    count++;
  }
  in.close();
  return count;
  
 }

 // prints heading of table
 private static void printTable() {
  System.out.println("\t\tList of People\t");
  
 }

}

/** OUTPUT
 					List of People	
Stephanie Guerrero	Guerrero, Stephanie 	 Stephanie---Guerrero 
Kaitlyn Cao	Cao, Kaitlyn 	 Kaitlyn---Cao 
Jorge Garcia	Garcia, Jorge 	 Jorge---Garcia 
Aarfa Aftab	Aftab, Aarfa 	 Aarfa---Aftab 
Jane Feng	Feng, Jane 	 Jane---Feng 

The list of the last names in the list are:
Guerrero
Cao
Garcia
Aftab
Feng

Enter a last name to see if it's in the list. 
feng
Sorry, we didn't find a matching name in the list.

The list in alphabetical order is: 
Aftab
Cao
Feng
Garcia
Guerrero
 */

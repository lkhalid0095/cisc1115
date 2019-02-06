package classExamples;

/* 
Name:  In.java
Author:  cogan
Description:   read a number from keyboard and print it
Assignment number:
Date Due:
Date Submitted:  18/12/06 23:25
*/

import java.util.Scanner;     

public class In{
public static void main(String [] args) {
int number;
Scanner in= new Scanner(System.in);//or sc or scanner (lowercase)

System.out.print( "Please enter a number: " );
number = in.nextInt();
System.out.println( "You entered "  + number );
in.close();
}
}
/* OUTPUT
Please enter a number:  7
You entered 7
*/

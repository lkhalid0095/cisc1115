package assignments;

import java.io.PrintStream;
import java.util.Scanner;

/*
 * Author: Lubna Khalid
 * CISC 1115 - TY11
 * Assignment 4
 * Date Due: 3/5/19
 * Date Submitted: 3/5/19 00:48:22
 * Description: A program that stimulates certain tasks of a calculator.
 * 
 */
public class Calculator {
	//prints the output for the task that's chosen by the user
	//output is sent to a file
	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream("output.txt");
		Scanner in = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		displayMenu();
		multiCalc(num1,num2,in,ps);
		ps.close();
		in.close();

	}
	//calculates the result of two double values with a specific operation 5 times.
	private static void multiCalc(double num1, double num2, Scanner in, PrintStream ps) {
		for(int i = 0; i<5; i++) {
			System.out.println("Type in the number of operation you'd like to do.");
			double response = in.nextDouble();
			System.out.println("Type in a double value.");
			num1 = in.nextDouble();
			System.out.println("Type in a double value.");
			num2 = in.nextDouble();
			calculate(num1, num2, response, ps);

		}
	}
	//calculates and prints the result based on the response the user gives.
	private static void calculate(double num1, double num2,double response, PrintStream ps) {
		double result = 0;
		String operation = "";
		if(response <= 6) 
		{
			if(response == 1) {
			result = num1 + num2;
			operation = "add";
			}else if(response == 2) {
			result = num1 - num2;
			operation = "subtract" ;
			}else if(response == 3) {
			result = num1 / num2;
			operation = "divide";
			}else if(response == 4) {
			result = num1 * num2;
			operation = "multiply";
			}else if(response == 5) {
			result = (num1+num2)/2;
			operation = "find the average of";
			}else if(response == 6) {
				if(num1 > num2) {
				result = num1;
				}else {
				result = num2;
				}
				operation = "find the max of";
			}
			ps.printf("Your original values were " + "%.2f" + " and " + "%.2f" + ". You chose to " + operation + " these numbers. " + "The result is, " + "%.2f", num1,num2,result);
			ps.println(".");
		
		}else {
			ps.println("Error, please type in a valid input.");
		}
	}
	
	//displays the menu to the user
	private static void displayMenu()
	{
		System.out.println("Welcome to Calculator Mania!");
		System.out.println("Your options include:");
		System.out.printf("%2d" + "  Addition", 1);
		System.out.printf("\n%2d" + "  Subtraction", 2);
		System.out.printf("\n%2d" + "  Divide", 3);
		System.out.printf("\n%2d" + "  Multiply", 4);
		System.out.printf("\n%2d" + "  Average of two numbers", 5);
		System.out.printf("\n%2d" + "  Maximum of two numbers\n", 6);

		
	}
	
	

}
/* OUTPUT
Welcome to Calculator Mania!
Your options include:
 1  Addition
 2  Subtraction
 3  Divide
 4  Multiply
 5  Average of two numbers
 6  Maximum of two numbers
Type in the number of operation you'd like to do.
6
Type in a double value.
25.2
Type in a double value.
45.8
Type in the number of operation you'd like to do.
 * OUTPUT IN THE FILE
Your original values were 25.20 and 45.80. You chose to find the max of these numbers. The result is, 45.80.
 * TRACE
 * main()
 * num1/0; num2/0;
 * multiCalc()
 * num1/0/25.2; num2/0/45.8; response 6;
 * calculate()
 * num1/25.2; num2/45.8; response/6; result/0/45.8; operation/""/"find the max of"; 
 * HANDCHECK
 * 25.2 !< 45.8, result = 45.8 
 */

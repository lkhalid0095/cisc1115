package classLabs;

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 2/7/19
* Date Submitted: 2/7/19
* Description: Lab 4.
*/
	public class FileInput {

			public static void main(String[] args) throws Exception
			{
					PrintStream ps = new PrintStream("output.txt");
					Scanner in = new Scanner(System.in);
					String name;
					System.out.println("What is your name?");
					name = in.nextLine();
					ps.println("Your name is " + name + ".");
					in.close();

			}

}

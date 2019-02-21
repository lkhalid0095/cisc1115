package classLabs;

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 2/7/19
* Date Submitted: 2/7/19
* Description: Lab 5.
*/
	public class ClassOutput {

			public static void main(String[] args) throws Exception 
			{
				
				Scanner in = new Scanner(new File("name.txt"));
				PrintStream ps = new PrintStream("info.txt");
				String name = in.nextLine();
				int age = in.nextInt(); 
				ps.println("Name: "+ name);
				ps.println("Age: "+ age);
				ps.close();
				in.close();
			}
			/*
			 *b. The name goes on the screen.
			 *c. Nothing on screen, it's an empty screen and the output goes to the file called age.
			 * 
			 */

	}

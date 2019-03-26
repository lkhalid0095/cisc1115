package classLabs;

import java.util.Scanner;

public class ReadFromKeyboard {
	//example to use CTRL-D and read from the keyboard not from a file.

	public static void main(String[] args) {
		double num; 
		Scanner in = new Scanner(System.in);
		System.out.println("Type in a num, type CTRL-D to exit.");
		while(in.hasNextInt()) {
			num = in.nextDouble();
			if(num > 5) {
				System.out.println("The number you entered is greater than five.");
			} else {
				System.out.println("The number you entered is less than five.");
			}
			System.out.println("Type in a num, type CTRL-D to exit.");
		}
		in.close();

	}

}

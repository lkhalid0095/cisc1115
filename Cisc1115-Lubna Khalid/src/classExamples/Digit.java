package classExamples;

import java.io.File;
import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int numb = in.nextInt();
		int countDig = 0;
		int backNum = 0;
		//System.out.println(numb);
		
		do {
			System.out.print(numb%10);
			numb/= 10;
			countDig++;
			
		}while(numb!=0);
		//System.out.println(" has " + countDig + " digits(s)");

	}

}

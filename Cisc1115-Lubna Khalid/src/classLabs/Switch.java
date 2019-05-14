package classLabs;

import java.util.Random;
import java.util.Scanner;

public class Switch {

	// tosses a dice and see if its odd or even.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
			do {

				int result = rand.nextInt(6) +1 ;
				System.out.println("You rolled " + result);
				switch(result){
				case 1: 
				case 3: 
				case 5: System.out.println("Odd");
				break;
				case 2:
				case 4: 
				case 6: System.out.println("Even");
				break;
				default: System.out.println("Error");
				break;
				}
				
			}while(going(in));
			
		

	}

	// sees if the person wants to continue dicing. 
	private static boolean going(Scanner in) {
		System.out.println("Do you want to continue with a new number? Enter -1 for no.");
		if(in.nextInt() == -1) {
			return false;
		}
		else return true;
		
	}

}


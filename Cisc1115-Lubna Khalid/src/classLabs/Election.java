package classLabs;

import java.util.Scanner;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 4/4/19
* Date Submitted: 4/4/19
* Description: Lab 21.
*/
public class Election {
	
	final static int NUMCANDIDATE = 4;
	//ask the user for the code, and prints the winner. 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[]count = new int[NUMCANDIDATE];
		System.out.println("Enter you choice as a number "
				+ "from 1 to " + NUMCANDIDATE + ".");
		System.out.println("Enter zero to stop.");
		int candidate = in.nextInt();
		candidate = tabVote(candidate,count,in);
		printResult(candidate, count);
		findWinner(count);
		
		in.close();
	}

	//finds which candidate won
	private static void findWinner(int[] count) {
		int largest = count[0];
		for(int i = 1; i< NUMCANDIDATE-1; i++) {
			if(count[i]> count[i+1]) {
				largest = count[i];
			}
		}
		System.out.println("The winner is Candidate " + largest+ ".");
	}

	//prints the result
	private static void printResult(int candidate, int[] count) {
		for(candidate = 0; candidate < NUMCANDIDATE;candidate++) {
			System.out.println("Candidate " + candidate + " received " 
					+ count[candidate] + " vote.");
		}
	}

	//tabulates the vote
	private static int tabVote(int candidate, int[] count, Scanner in) {
		while(candidate>0 && candidate <= NUMCANDIDATE) {
			count[candidate - 1 ]++;
			System.out.println("Enter you choice as a number "
					+ "from 1 to " + NUMCANDIDATE + ".");
			System.out.println("Enter zero to stop.");
			candidate = in.nextInt();
			
		}
		return candidate;
	}

}
/* OUTPUT
 Enter you choice as a number from 1 to 4.
Enter zero to stop.
2
Enter you choice as a number from 1 to 4.
Enter zero to stop.
2
Enter you choice as a number from 1 to 4.
Enter zero to stop.
3
Enter you choice as a number from 1 to 4.
Enter zero to stop.
1
Enter you choice as a number from 1 to 4.
Enter zero to stop.
2
Enter you choice as a number from 1 to 4.
Enter zero to stop.
2
Enter you choice as a number from 1 to 4.
Enter zero to stop.
0
Candidate 0 received 1 vote.
Candidate 1 received 4 vote.
Candidate 2 received 1 vote.
Candidate 3 received 0 vote.
The winner is Candidate 1.
*/

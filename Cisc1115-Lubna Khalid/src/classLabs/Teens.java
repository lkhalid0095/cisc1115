package classLabs;
/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 3/21/19
* Date Submitted: 3/21/19
* Description: Lab 17.
*/
public class Teens {
	//find a product of three ages <= 19 is 4590
	public static void main(String[] args) {
		for(int num1 = 0; num1<= 19; num1++) {
			for(int num2 = 0;num2<19; num2++) {
				for(int num3 = 0; num3 <19; num3++) {
					if(num1*num2*num3 == 4590) {
						System.out.println(num1 + " " + num2 + " " + num3 + " ");
					}
				}
			}

		}

	}

}

package classLabs;
/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 3/21/19
* Date Submitted: 3/21/19
* Description: Lab 16.
*/
public class Stars {

	//prints a triangle using "X"
	public static void main(String[] args){
		int MAX_ROW = 25;
		int MAX_COL= 25;
		for(int row= 0; row <= MAX_ROW; row++ ) {
			for(int col = 0;col < row;col++ ){
				System.out.print("X");
			}
			System.out.print("#");
			System.out.println();

		}
		for(int row= 1; row <= MAX_ROW; row++ ) {
			for(int col = 1;col <= row-1;col++ ){
				System.out.print("X");
			}
			System.out.print("#");
			System.out.println();

		}

	}

}

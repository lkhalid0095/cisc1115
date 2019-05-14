package classExamples;
import java.io.*;
import java.util.*;
public class Names {

		final static int TOTALNAMES=15;
		public static void main(String[]args) throws FileNotFoundException  {
			int count, n;
			String space = " ";
			String [] names = new String[TOTALNAMES];
			//String
			File file = new File ("Names12.txt");
			Scanner  read = new Scanner(file);	
			printHeading();
			//you don't need to send file here?
			count = readNames(read);
			String[]firstname = new String[TOTALNAMES];
			int j=0;
			while(read.hasNext()&&count<j) {
				names[j] = read.next();
					System.out.println(names[j].substring(names[j].indexOf(" ")+1));
					j++;
				
			}
			
		}
		//This method prints the heading centered
		private static void printHeading() {
		}
		
		//This method reads in the names from the file into an array
		public static int readNames(Scanner keyboard) throws FileNotFoundException {
			int count = 0;
				String [] names = new String[15];
				for (int i = 0; i < names.length; i++) {
					names [i] = keyboard.nextLine();
					System.out.println(""+names[i]);
					count++;
				}	
				//not sure if this method should return or be void
		//public static void threeSpaceName( String []firstname, String[] lastname) {
			//System.out.printf("\n", firstname+"    "+last);
			return count;
		}
				
					
			
		//}
	}


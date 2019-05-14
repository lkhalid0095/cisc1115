package classLabs;

/*
* Author: Lubna Khalid
* CISC 1115 - TY11
* Date Due: 4/4/19
* Date Submitted: 4/4/19
* Description: Lab 25.
*/
public class StringMethods {

	// uses various string methods
	public static void main(String[] args) {
		String str = "Hufflepuff";
		String str2  = "";
		int length = str.length();
		int firstOccur = str.indexOf('f');
		int middleOccur =str.indexOf('f', 4);
		int lastOccur = str.lastIndexOf('f');
		System.out.println("The 'f' first occurs at index "+firstOccur+
				". It occurs in the middle at index "+ middleOccur+
				" \nAnd lastly occurs at index "+ lastOccur +".");
		int noOccur = str.lastIndexOf('r');
		if(noOccur == -1)
		System.out.println("The character 'r' doesn't appear in "
				+ "the string.");
		str2 = str.substring(3,7);
		System.out.println("The first string is " + str +"."
				+ "The second string is " + str2 + "." );
		String remainChar = str.substring(4);
		System.out.println("The remaining characters are "+ remainChar);
		str2 = str2.replace("hu","p");
		System.out.println("Updated string "+str2);
		for(int i = 0;i<str.length();i++) {
			System.out.print(str.charAt(i) + " ");
		}
		
		
	}

}
/* OUTPUT
The 'f' first occurs at index 2. It occurs in the middle at index 8 
And lastly occurs at index 9.
The character 'r' doesn't appear in the string.
The first string is Hufflepuff.The second string is flep.
The remaining characters are lepuff
Updated string flep
H u f f l e p u f f 
 */

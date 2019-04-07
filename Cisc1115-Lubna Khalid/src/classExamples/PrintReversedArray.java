package classExamples;
/* 
 * PrintReversedArray.java
 *  uses array to method and Arrays.toString to print the entire array
 * Description: Prints and counts the numbers in an external file and prints them in reversed order.
 */
 
import java.util.Arrays; 
import java.io.File;
import java.util.Scanner;

public class PrintReversedArray {

    public static void main(String[] args) throws Exception{
        final int MAXNUMBER = 10;
        int i, count;
        int[] number = new int[MAXNUMBER];

        count = populateArray(number);

        System.out.printf("\nThe array contains % d elements.\n", count);
        System.out.println(Arrays.toString(number));
        System.out.printf("\nThe array reversed\n");
        for (i = count - 1; i >= 0; i--) {
            System.out.printf("%d\n", number[i]);
        }
    }
    
    // Method populateArrary reads a number one at a time, places it into the 
    // next available slot of the array and returns the number of values 
    // that were read.
    public static int populateArray(int[] x) throws Exception {
        Scanner sc = new Scanner(new File("NumbersData.txt"));
        
        int count = 0;
        while (sc.hasNext()) {
            x[count] = sc.nextInt();
            count++;
        }
        return count;
    }
}

/*
The array contains  5 elements.
[3, 4, 5, 6, 7, 0, 0, 0, 0, 0] 

The array reversed
7
6
5
4
3
 */

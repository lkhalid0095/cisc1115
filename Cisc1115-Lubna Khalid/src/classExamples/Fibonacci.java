package classExamples;

//Name: Fibonacci.java
//Author: Cogan
//Description: calculate and print the first 10 fibonacci numbers



public class Fibonacci {
public static void main(String [] args)
{
 final int SIZE=10;
 double[] f= new double[SIZE];
     
 f[0]=1;
 f[1]=1;
 System.out.println( "f[" + 1 + "]: "+ f[0]);
 System.out.println( "f[" + 2 + "]: "+ f[1]);
 for(int i=2; i<SIZE; i++){
    f[i]=f[i-1]+f[i-2];
    System.out.println( "f[" + (i+1) + "]: "+ f[i]);
 }   
}       
}       
/*
f[1]: 1.0 
f[2]: 1.0 
f[3]: 2.0 
f[4]: 3.0 
f[5]: 5.0 
f[6]: 8.0 
f[7]: 13.0 
f[8]: 21.0 
f[9]: 34.0 
f[10]: 55.0 
*/

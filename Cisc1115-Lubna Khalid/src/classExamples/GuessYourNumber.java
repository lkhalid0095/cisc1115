package classExamples;
	  
	import java.util.Scanner;

	public class GuessYourNumber{
	  public static void main(String[] args) {
	      final int MAX_RANGE=100;
	      int lowerBound = 1, upperBound = MAX_RANGE, numGuesses = 0, response;
	      
	      GiveIntro();
	      
	      
	      do { // strategy for binary search
	          int middle = (lowerBound + upperBound) / 2;
	          
	          response = GetResponse(middle);
	          if (response == 2) {
	              upperBound = middle - 1;
	          }
	          else if (response == 3) {
	              lowerBound = middle + 1;
	          }
	          
	          numGuesses++;
	      }while (response != 1 && lowerBound <= upperBound); 
	      
	      GiveResults(response, numGuesses);
	  }
	 
	  
	 // gives introduction to the game
	  static void GiveIntro() {
	    Scanner sc = new Scanner(System.in);  
	    System.out.println("Think of a number between 1 and 100.");
	    System.out.print("Hit any key when you are ready: ");
	    sc.next(); //not assigned
	  }
	  
	  //displays prompt and reads user's response
	  static int GetResponse(int guess) {
	      Scanner sc = new Scanner(System.in);
	      int response;
	      
	      System.out.println( "The computer guesses " + guess);
	      System.out.println( "Is that guess..." );
	      System.out.println( "  1 correct?" );
	      System.out.println( "  2 too high?");
	      System.out.println( "  3 too low?" );
	           
	      do{
	          System.out.println( "Enter your response. It must be between 1 and 3: ");
	          response=sc.nextInt();
	      }while (response < 1 || response > 3);
	      return response;
	  }
	  
	  // if response is 1, then displays number of guesses
	  // else it scolds the cheater
	  static void GiveResults(int response, int numGuesses) {
	      if (response == 1) {
	          System.out.print( "The computer got it in " + numGuesses);
	          if (numGuesses == 1) {
	              System.out.println( " guess.");
	          }
	          else {
	              System.out.println( " guesses.");
	          }
	      }
	      else {
	          System.out.println(  "\nYou cheated!");
	      }
	  }
	

}

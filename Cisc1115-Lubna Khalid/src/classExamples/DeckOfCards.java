package classExamples;

import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};
        
        // Initialize cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;
        
       // Shuffle the cards
        Random random=new Random();
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = random.nextInt(deck.length);
            int temp = deck[i];
            deck[i] = deck[index]; 
            deck[index] = temp;
        }
        
        System.out.println();
        
        for (int i = 0; i < deck.length; i++) {
            if (i%10 ==0) System.out.println();
            System.out.print(deck[i]+" ");
        }
        
        // Display the cards
        for (int i = 0; i < deck.length; i++) {
            String suit = suits[deck[i] % 4];
            String rank = ranks[deck[i] % 13];
            System.out.println("Subscript "+ i+ " Card number " + deck[i] + ": " 
                                   + rank + " of " + suit);
        }
        
    }
}
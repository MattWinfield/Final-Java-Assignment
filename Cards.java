
import java.util.Random;


/*
     * Author Matthew Winfield
     * Shuffles a deck of cards and outputs the contents of the deck to the screen 
     * 
 */
public class Cards {

    public static void main(String[] args) {

        String deck[] = {"Ace_of_Hearts", "2_of_Hearts", "3_of_Hearts",
            "4_of_Hearts", "5_of_Hearts", "6_of_Hearts", "7_of_Hearts",
            "8_of_Hearts", "9_of_Hearts", "10_of_Hearts", "Jack_of_Hearts",
            "Queen_of_Hearts", "King_of_Hearts", "Ace_of_Spades", "2_of_Spades",
            "3_of_Spades", "4_of_Spades", "5_of_Spades", "6_of_Spades",
            "7_of_Spades", "8_of_Spades", "9_of_Spades", "10_of_Spades",
            "Jack_of_Spades", "Queen_of_Spades", "King_of_Spades",
            "Ace_of_Diamonds", "2_of_Diamonds", "3_of_Diamonds", "4_of_Diamonds",
            "5_of_Diamonds", "6_of_Diamonds", "7_of_Diamonds", "8_of_Diamonds",
            "9_of_Diamonds", "10_of_Diamonds", "Jack_of_Diamonds", "Queen_of_Diamonds",
            "King_of_Diamonds", "Ace_of_Clubs", "2_of_Clubs", "3_of_Clubs",
            "4_of_Clubs", "5_of_Clubs", "6_of_Clubs", "7_of_Clubs",
            "8_of_Clubs", "9_of_Clubs", "10_of_Clubs", "Jack_of_Clubs",
            "Queen_of_Clubs", "King_of_Clubs"};
        
        deck = shuffle (deck);

        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);

        }

    }

    public static String[] shuffle(String[] z) {

        Random rnd = new Random();
        for (int i = z.length - 1; i >= 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = z[index];
            z[index] = z[i];
            z[i] = a;
        }
        return z;
    }

}

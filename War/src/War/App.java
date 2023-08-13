package War;

import java.util.ArrayList;
import java.util.List;

public class App{
	
	public static void main(String[] args) {
		//Create a new deck and shuffle it
		Deck<?> gameDeck = new Deck();
        gameDeck.shuffle();

        //Create hands for each player
        List<Card> player1Hand = new ArrayList<Card>();
        List<Card> player2Hand = new ArrayList<Card>();

        //Create player instances
        Player player1 = new Player("Trent", player1Hand, 0);
        Player player2 = new Player("Kyle", player2Hand, 0);

        //Draw 26 cards for each player
        for (int i = 0; i < 26; i++) {
            player1.draw(gameDeck);
            player2.draw(gameDeck);
        }

        //Compare and reveal each player's flipped cards
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();
            
            //Print the flipped cards and the outcome of the round
            System.out.println(player1.getName() + " flips: " + card1.getName() + " of " + card1.getSuit());
            System.out.println(player2.getName() + " flips: " + card2.getName() + " of " + card2.getSuit());

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins this round!");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("It's a tie!");
            }
        }

        //Print final scores and determine the winner
        System.out.println(player1.getName() + " score: " + player1.getScore());
        System.out.println(player2.getName() + " score: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
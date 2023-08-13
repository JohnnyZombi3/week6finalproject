package War;

import java.util.List;
	
	public class Player{
	String name;
	List<Card> hand;
	Integer score;
	
	//Constructor to initialize player's name, hand, and score
	Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}
	
	//Method to "flip" a card from the player's hand
	public Card flip1() {
		Card card = this.hand.remove(0); //Remove and return the first card from the hand
		return card;
	}
	
	public Card flip() {
	    if (!hand.isEmpty()) {
	        Card card = hand.remove(0);
	        return card;
	    }
	    return null;
	}
	
	//Method to draw a card from the deck and add it to the player's hand
	public void draw(Deck<?> deck) {
		Card card = deck.draw();
		this.hand.add(card);
	}
	
	//Method to increment the player's score
	public void incrementScore() {
		this.score ++;
	}
	
	//Setter method for the player's hand
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	//Getter and setter methods for the player's name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter and setter methods for the player's score
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
	//Method to describe the player's name, score, and cards in hand
	public void describe( ) {
		System.out.println(name + " earned " + score + "and is holding:");
	for (Card card : hand) {
		card.describe();
	}
	}
	}
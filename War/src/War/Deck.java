package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck<cards> {
	//List to store the cards in the deck
	List<Card> cards = new ArrayList<Card>();

//Constructor to initialize the deck with standard 52 cards	
public Deck(){
		String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
		String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				//Create a new Card object and add it to the cards list
				Card card = new Card(number, suit, count);
				this.cards.add(card);
				count++;
			}
		}
	}

//Getter and setter methods for the cards list
public List<Card> getCards() {
	return cards;
}
public void setCards(List<Card> cards) {
	this.cards = cards;
}

//Method to describe the entire deck
public void describe() {
	for (Card card : this.cards) {
		//Call the describe method of the Card class to print card information
		card.describe();
	}
}

//Method to shuffle the cards in the deck
public void shuffle() {
	Collections.shuffle(this.cards);
	}

//Method to draw a card from the deck
public Card draw() {
	if (!cards.isEmpty()) {
		//Remove and return the first card from the list
		return cards.remove(0);
	}
	return null;
}
}
package War;

public class Card {

//The fields to store card information
String name;	//Name for each card such as, "2", "5", "King", or "Ace"
String suit;	//Suit of the card, "Spades", "Hearts", "Diamonds", or "Clubs"
int value;		//Numeric value of each card, 2-14

	//Constructor to initialize card properties
	Card(String name, String suit, int value) {
		this.name = name;
		this.value = value;
		this.suit = suit;
	}
//Getter and setter methods for the card properties	
public String getName() {
	return name;
}
public void setName (String name) {
	this.name = name;
}
public String getSuit() {
	return suit;
}
public void setSuit(String suit) {
	this.suit = suit;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
//Method to describe the card
public void describe() {
	System.out.println(this.name + " of " + this.suit + " has value of: " + this.value);
}
}
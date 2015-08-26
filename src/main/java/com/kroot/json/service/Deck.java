package com.kroot.json.service;

import java.util.Random;

import com.kroot.json.entity.Card;
import com.kroot.json.utils.DeckDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = DeckDeserializer.class)
public class Deck {

//	int idIndex = 0;
	private static int deckId = 0; //create getter and setter pair

	private Card[] cards; // array holding all 52 cards  (the deck of cards)
	private int cardsInDeck; // the current number of cards in the deck //needed for shuffling algorithm

	public static final int DECK_SIZE = 52; 
	// size of standard deck of cards
	
	public Deck(int deckId, Card[] cards) {
		System.out.println("All Args Constructor!!!!");
		Deck.deckId = deckId;
		this.cards = cards;
	}

	/**
	 * Constructs a new Deck object containing 52 cards.
	 */
	public Deck() {
		System.out.println("No Args Constructor!!!!");
		deckId++;
		cards = new Card[DECK_SIZE];
		cardsInDeck = DECK_SIZE;
		//deckId = getDeckId();
		//setDeckId(getDeckId());
		for (int i = 0; i < 13; i++) {
			cards[i] = new Card(i + 1, Card.HEARTS);
			cards[i + 13] = new Card(i + 1, Card.DIAMONDS);
			cards[i + 26] = new Card(i + 1, Card.CLUBS);
			cards[i + 39] = new Card(i + 1, Card.SPADES);
		}
	}
	
/*	public Deck createNewDeck(){
		//Deck deck = new Deck();  //this causes a total mess at RT
		deckId++;
		cards = new Card[DECK_SIZE];
		cardsInDeck = DECK_SIZE;
		//deck.setDeckId(getDeckId());
		for (int i = 0; i < 13; i++) {
			cards[i] = new Card(i + 1, Card.HEARTS);
			cards[i + 13] = new Card(i + 1, Card.DIAMONDS);
			cards[i + 26] = new Card(i + 1, Card.CLUBS);
			cards[i + 39] = new Card(i + 1, Card.SPADES);
		}
		return deck;
	}*/
	
/*	*//**
	 * @returns a new deck id
	 *//*
	public int getDeckId() {
		
		return deckId++;
	}

	*//**
	 * @param idIndex the idIndex to set
	 *//*
	public void setDeckId(int deckId) {
		this.deckId = deckId;
	}
*/
	
	
	///////////////////?????///////////////////
	
	/**
	 * Returns the number of cards in the deck.
	 * @return number of cards in the deck
	 */
	public int cardsInDeck() {
		return cardsInDeck; 
		}

	/**
	 * Deals one card from the deck, decreasing the number of cards in the 
	 * deck by one.
	 * 
	 * @return the next Card object in the deck
	 * @throws EmptyDeckException
	 *//*
	public Card deal() {

		if (cardsInDeck == 0) // check for an empty deck
			throw new EmptyDeckException();

		cardsInDeck--;
		return cards[cardsInDeck];
	}*/

/*	public void shuffle() {
		int newI;
		Card temp;
		Random randIndex = new Random();

		for (int i = 0; i < cardsInDeck; i++) {

			// pick a random index between 0 and cardsInDeck - 1
			newI = randIndex.nextInt(cardsInDeck);

			// swap cards[i] and cards[newI]
			temp = cards[i];
			cards[i] = cards[newI];
			cards[newI] = temp;
		}
	}*/

/*	*//**
	 * Resets the deck so that it has all its cards. Note that the order of 
	 * the cards may be random.
	 *//*
	public void reset() {
		cardsInDeck = DECK_SIZE;
	}*/

	/**
	 * Returns a String representation of the Deck object. The cards 
	 * currently in the deck are printed out 13 to a row.
	 * 
	 * @return a String representation of the deck
	 */
	public String toString() {

		// check for an empty deck
		if (cardsInDeck == 0)
			return "<empty>";

		String s = cards[0].toString() + ' ';
		for (int i = 1; i < cardsInDeck; i++) {
			if (i % 13 == 0)
				s += '\n';
			s += cards[i].toString() + ' ';
		}
		return s;
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public static int getDeckId() {
		return deckId;
	}

	public static void setDeckId(int deckId) {
		Deck.deckId = deckId;
	}

} 
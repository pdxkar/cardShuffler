package com.kroot.json.service;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.kroot.json.entity.Card;
import com.kroot.json.utils.DeckDeserializer;
//TODO Move class to com.kroot.json.entity
@JsonDeserialize(using = DeckDeserializer.class)
public class Deck {

	private static int deckId = 0; 

	private Card[] cards; 
	private int cardsInDeck; 

	public static final int DECK_SIZE = 52; 
	
	public Deck(int deckId, Card[] cards) {
		Deck.deckId = deckId;
		this.cards = cards;
	}

	public Deck() {
		deckId++;
		cards = new Card[DECK_SIZE];
		cardsInDeck = DECK_SIZE;
		for (int i = 0; i < 13; i++) {
			cards[i] = new Card(i + 1, Card.HEARTS);
			cards[i + 13] = new Card(i + 1, Card.DIAMONDS);
			cards[i + 26] = new Card(i + 1, Card.CLUBS);
			cards[i + 39] = new Card(i + 1, Card.SPADES);
		}
	}
		
	public int cardsInDeck() {
		return cardsInDeck; 
		}

	//Return face and suit equivalent of each card
	//TODO Make this work with the deserializers!
	public String toString() {

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
package com.kroot.json.service;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.kroot.json.entity.Card;
import com.kroot.json.utils.DeckDeserializer;
//TODO Move class to com.kroot.json.entity
@JsonDeserialize(using = DeckDeserializer.class)
public class Deck {

	private int deckId = 0; 
	private static int counter = 0;

	private String[] cardsString;
	private int cardsInDeck; 

	public static final int DECK_SIZE = 52; 
	
	public Deck(int deckId, Card[] cards) {
		this.deckId = deckId;
		this.cardsString = cardsString;
	}

	public Deck() {
		deckId = counter;
		cardsString = new String[DECK_SIZE];
		cardsInDeck = DECK_SIZE;
		for (int i = 0; i < 13; i++) {
			cardsString[i] = new Card(i + 1, Card.HEARTS).toString();
			cardsString[i + 13] = new Card(i + 1, Card.DIAMONDS).toString();
			cardsString[i + 26] = new Card(i + 1, Card.CLUBS).toString();
			cardsString[i + 39] = new Card(i + 1, Card.SPADES).toString();
		}
		counter++;
	}
		
	public int cardsInDeck() {
		return cardsInDeck; 
		}

	//Return face and suit equivalent of each card
	public String toString() {

		if (cardsInDeck == 0)
			return "<empty>";

		String s = cardsString[0] + ' ';
		for (int i = 1; i < cardsInDeck; i++) {
			if (i % 13 == 0)
				s += '\n';
			s += cardsString[i] + ' ';
		}
		return s;
	}
	
	public String[] getCards() {
		return cardsString;
	}

	public void setCards(String[] cards) {
		this.cardsString = cardsString;
	}

	public int getDeckId() {
		return deckId;
	}

	public void setDeckId(int deckId) {
		this.deckId = deckId;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Deck.counter = counter;
	}

} 
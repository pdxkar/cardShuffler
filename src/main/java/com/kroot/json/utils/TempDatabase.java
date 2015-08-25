package com.kroot.json.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.kroot.json.entity.Card;
import com.kroot.json.service.Deck;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TempDatabase {
	
	Deck deck;

	int idIndex = 0;
	List<Deck> deckList;
	
	private Card[] cards; // array holding all 52 cards
	private int cardsInDeck; // the current number of cards in the deck

	public static final int DECK_SIZE = 52; 
	
	//create an initial Deck for testing
	public TempDatabase(){
		cards = new Card[DECK_SIZE];
		cardsInDeck = DECK_SIZE;
		for (int i = 0; i < 13; i++) {
			cards[i] = new Card(i + 1, Card.HEARTS);
			cards[i + 13] = new Card(i + 1, Card.DIAMONDS);
			cards[i + 26] = new Card(i + 1, Card.CLUBS);
			cards[i + 39] = new Card(i + 1, Card.SPADES);
		}
	}
	
	/**
	 * Returns the number of cards in the deck.
	 * @return number of cards in the deck
	 */
	public int cardsInDeck() {
		return cardsInDeck; 
		}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
	//TEST!!!!!!
	public Deck getTestDeck() {
		return new Deck();
	}
			
}



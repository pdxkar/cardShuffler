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
	
	//TESTING
	Deck deckZero;
	Deck deckOne;
	Deck deckTwo;
	Deck deckThree;
	//TESTING

	int idIndex = 0;
	List<Deck> deckList;  //Make this private with getters and setters
	
	private Card[] cards; // array holding all 52 cards
	private int cardsInDeck; // the current number of cards in the deck

	public static final int DECK_SIZE = 52; 
	
	//create four initial Decks for testing  TEMPORARY
	public TempDatabase(){ }
	
	public List<Deck> initDatabase(){
		
		deckList = new ArrayList<>();
		
		deckZero = new Deck();
		deckOne = new Deck();
		deckTwo = new Deck();
		deckThree = new Deck();
		
		deckList.add(deckZero);
		deckList.add(deckOne);
		deckList.add(deckTwo);
		deckList.add(deckThree);
		
		return deckList;
		
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
	
	//TEST - get all the decks
	public List<Deck> getAllDecks(){
		return deckList;
	}
			
}



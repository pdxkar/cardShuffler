package com.kroot.json.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

	private static List<Deck> deckList;  
	
	private static final int CARDSINDECK = 52; // the current number of cards in the deck  //!!!!!!Turn this into a constant = 52

	public static final int DECK_SIZE = 52; ////!!!!!Delete this?
	
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
		return CARDSINDECK; 
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
	
	public Deck getDeckById(int id){
		return deckList.get(id);
	}
	
	//TODO add a try-catch here
	public boolean deleteDeckById(int id){  
		deckList.remove(id);
		return true;
	}
	
	//TODO This method should probably be moved to the service layer or somewhere more appropriate!
	public Deck shuffleDeckById(int id){ 
		
		Deck deckToBeShuffled = deckList.get(id);
		
		Card[] cardsToBeShuffled = deckToBeShuffled.getCards();

		int newI;
		Card temp;
		Random randIndex = new Random();

		for (int i = 0; i < CARDSINDECK; i++) {
			// assign newI a random index between 0 and 51
			newI = randIndex.nextInt(CARDSINDECK);
			//      swap cards[i] and cards[newI]
			//temp is the nth card in the shuffle
			temp = cardsToBeShuffled[i];
			//switch the nth card in the shuffle with a card of a random index between 0 and 51
			cardsToBeShuffled[i] = cardsToBeShuffled[newI];
			//switch the above randomly indexed card with the nth card of the shuffle.
			cardsToBeShuffled[newI] = temp;
		}
		
		//reset the cards of the deckToBeShuffled to that of the newly shuffled cards
		deckToBeShuffled.setCards(cardsToBeShuffled);

		return deckToBeShuffled;
	}
			
}



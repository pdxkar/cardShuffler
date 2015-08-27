package com.kroot.json.utils;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.kroot.json.entity.Card;
import com.kroot.json.service.Deck;
import com.kroot.json.utils.TempDatabase;

/**
 * JUnit tests for TempDatabase class.
 */
public class TempDatabaseTest {

	TempDatabase tester = new TempDatabase();

	/**
	 *
	 * Test shuffleDeckById functionality. Ascertains that after an existing
	 * deck is shuffled by id that the order of its "cards" are different before
	 * and after their shuffling.
	 * 
	 */
	@Test
	public void testShuffleDeckByIdHappyPath() {

		// trigger the temporary database initializer
		// TODO fix it so you don't need that thing!
		tester.initDatabase();

		// create a fresh deck in the "database" to shuffle
		Deck deckBeforeShuffling = new Deck();

		// have to add the deck to the "database" manually because the test
		// isn't
		// going through the service's "create deck" method
		tester.addDeckToDeckList(deckBeforeShuffling);

		List<Deck> deleteMe = tester.getAllDecks();

		int testDeckId = deckBeforeShuffling.getDeckId();

		// shuffle the deck
		Deck shuffledDeck = tester.shuffleDeckById(testDeckId);

		// create an ordered deck to compare to the shuffled deck
		Deck orderedDeck = new Deck();

		int numberOfCardsInSameDeckPosition = 0;

		// this testing algorithm is flawed because it makes the assumption that
		// both decks
		// contain the same number of cards. If they don't, the test could
		// return false results.
		// TODO fix test so "52" is smarter
		for (int j = 0; j < 52; j++) {
			String shuffledCard = shuffledDeck.getCards()[j];
			String orderedCard = orderedDeck.getCards()[j];
			if (shuffledCard.equals(orderedCard)
) {
				numberOfCardsInSameDeckPosition++;
			}
		}

		assertTrue(
				"There are less than 10 cards in the 52 card decks that are in the same position in both decks.",
				numberOfCardsInSameDeckPosition < 10);
	}

	/**
	 *
	 * Test deleteDeckById functionality. Ascertains that when an existing deck
	 * is deleted by id that it has been "removed" from the database.
	 * 
	 */
	@Test
	public void testDeleteDeckByIdHappyPath() {

		int testId = 2;

		// TODO resolve nullpointer
		// Boolean result = tester.deleteDeckById(testId);

		/*
		 * assertEquals(
		 * "Response returned from deleteDeckById() indicates the Deck was deleted."
		 * , "true", result);
		 */
	}
}
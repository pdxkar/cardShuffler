package com.kroot.json.action;

import org.junit.Test;

import com.kroot.json.action.DeckResource;
import com.kroot.json.service.Deck;

/**
 * JUnit tests for DeckResource class.
 */
public class DeckResourceTest {

	DeckResource tester = new DeckResource();

	/**
	 *
	 * Tests the DeckResource's getAll() method. Ascertains that all decks are
	 * returned when the method is called.
	 */
	@Test
	public void testGetAllDecksHappyPath() {

		// TODO Test that all decks are returned when the method is called.
		// TODO Create sad path tests.
		// This test will be meaningful once appropriate error handling is in
		// place
		// in the DeckResource and DeckService layers.
		// The DeckService layer will be mocked.

	}

	/**
	 *
	 * Tests getDeckById functionality. Ascertains that when an existing deck is
	 * requested by id that it is returned from the "database".
	 * 
	 */
	@Test
	public void testGetDeckByIdHappyPath() {

		int testId = 2;

		//TODO Mock the result from the TempDatabase
		//String result = tester.get(testId);

		// TODO Test that the correct deck is returned when the method is
		// called.
		// TODO Create sad path tests.
		// This test will be meaningful once appropriate error handling is in
		// place
		// in the DeckResource and DeckService layers.
	}

	/**
	 *
	 * Tests createNewDeck functionality. Ascertains that when a deck is created
	 * that it is returned from the "database".
	 * 
	 */
	@Test
	public void testCreateNewDeckHappyPath() {

		//TODO Mock the result from the TempDatabase
		//Deck result = tester.createNewDeck();

		// TODO Test that a deck is returned when the method is called.
		// TODO Create sad path tests.
		// This test will be meaningful once appropriate error handling is in
		// place
		// in the DeckResource and DeckService layers.
		// The DeckService layer will be mocked.
	}

	/**
	 *
	 * Tests shuffleDeckById functionality. Ascertains that after an existing
	 * deck is shuffled by id that the order of its "cards" are different before
	 * and after their shuffling.
	 * 
	 */
	@Test
	public void testShuffleDeckHappyPath() {

		int testId = 2;

		//TODO Mock the result from the TempDatabase
		//Deck result = tester.shuffleDeckById(testId);

		// TODO Test that a differently ordered deck is returned when the method
		// is called.
		// TODO Create sad path tests.
		// This test will be meaningful once appropriate error handling is in
		// place
		// in the DeckResource and DeckService layers.
		// The DeckService layer will be mocked.
	}

	/**
	 *
	 * Tests deleteDeckById functionality. Ascertains that after an existing
	 * deck is deleted by id that it has been removed from the "database".
	 * 
	 */
	@Test
	public void testDeleteDeckByIDHappyPath() {

		int testId = 2;

		//TODO Mock the result from the TempDatabase
		//String result = tester.deleteDeckById(testId);

		// TODO Test that after an existing deck is deleted by id that it is
		// removed from the "database".
		// TODO Create sad path tests.
		// This test will be meaningful once appropriate error handling is in
		// place
		// in the DeckResource and DeckService layers.
		// The DeckService layer will be mocked.
	}
}
package com.kroot.json.service;

import org.junit.Test;

/**
 * JUnit tests for DeckService class.
 */

public class DeckServiceTest {

	DeckService tester = new DeckServiceImpl();

	/**
	 *
	 * Tests the DeckService's getAll() method. Ascertains that all decks are
	 * returned when the method is called.
	 */
	@Test
	public void testGetAllDecksHappyPath() {

		// TODO Test that all decks are returned when the method is called.
		// TODO Create sad path tests.
		// This test will be meaningful once appropriate error handling is in
		// place
		// in the TemporaryDatabase and DeckService layers.
		// The TempDatabase layer will be mocked.

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

		Deck result = tester.getDeckById(testId);

		// TODO Test that the correct deck is returned when the method is
		// called.
		// TODO Create sad path tests.
		// This test will be meaningful once appropriate error handling is in
		// place
		// in the TemporaryDatabase and DeckService layers.
		// The TempDatabase layer will be mocked.
	}

	/**
	 *
	 * Tests createNewDeck functionality. Ascertains that when a deck is created
	 * that it is returned from the "database".
	 * 
	 */
	@Test
	public void testCreateNewDeckHappyPath() {

		Deck result = tester.createNewDeck();

		// TODO Test that a deck is returned when the method is called.
		// TODO Create sad path tests.
		// This test will be meaningful once appropriate error handling is in
		// place
		// in the TemporaryDatabase and DeckService layers.
		// The TempDatabase layer will be mocked.
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

		Deck result = tester.createNewDeck();

		// TODO Test that a differently ordered deck is returned when the method
		// is called.
		// TODO Create sad path tests.
		// This test will be meaningful once appropriate error handling is in
		// place
		// in the TemporaryDatabase and DeckService layers.
		// The TempDatabase layer will be mocked.
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

		Boolean result = tester.deleteDeckById(testId);

		// TODO Test that after an existing deck is deleted by id that it is
		// removed from the "database".
		// TODO Create sad path tests.
		// This test will be meaningful once appropriate error handling is in
		// place
		// in the TemporaryDatabase and DeckService layers.
		// The TempDatabase layer will be mocked.
	}
}
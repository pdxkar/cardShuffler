package com.kroot.json.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kroot.json.service.Deck;

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

		int testId = 2;

		// TODO capture the state of the deck before it is shuffled.

		Deck result = tester.shuffleDeckById(testId);

		// TODO capture the state of the deck after it is shuffled.

		// TODO add appropriate assert to compare the two states to ascertain
		// that the "cards" are in a different order.
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

		Boolean result = tester.deleteDeckById(testId);

		assertEquals(
				"Response returned from deleteDeckById() indicates the Deck was deleted.",
				"true", result);
	}
}
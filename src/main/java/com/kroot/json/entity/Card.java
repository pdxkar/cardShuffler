package com.kroot.json.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.kroot.json.utils.CardDeserializer;

/**
 * Represents a playing card.
 * 
 * Bugs: none known
 * @author Beck Hasti (hasti@cs.wisc.edu),
 *         copyright 2005, all rights reserved
 */
@JsonDeserialize(using = CardDeserializer.class)
public class Card {

	private int face; // the card's face value, between 1 and 13 inclusive
	private int suit; // the card's suit; one of the class constants

	// class constants for the suits
	public static final int HEARTS = 1;
	public static final int DIAMONDS = 2;
	public static final int CLUBS = 3;
	public static final int SPADES = 4;

	/**
	 * Constructs a Card object with the given face value and suit value. 
	 * The face value of the card is set to 1 if an invalid face value is 
	 * given; the suit of the card is set to HEARTS if an invalid suit is 
	 * given.
	 * 
	 * @param face  the face value of the card
	 * @param suit  the suit of the card
	 */
	public Card(int face, int suit) {
		this.face = face;
		if (face < 1 || face > 13) {
			System.out.println("ERROR: invalid face value");
			this.face = 1;
		}

		this.suit = suit;
		if (suit != HEARTS && suit != DIAMONDS && suit != CLUBS
				&& suit != SPADES) {
			System.out.println("ERROR: invalid suit value");
			this.suit = HEARTS;
		}
	}

	/**
	 * Returns the face value of the card.
	 * 
	 * @return face value of the card (between 1 and 13, inclusive)
	 */
	public int getFace() {
		return face;
	}

	/**
	 * Returns the suit of the card.
	 * 
	 * @return suit of the card (HEARTS, DIAMONDS, CLUBS, or SPADES)
	 */
	public int getSuit() {
		return suit;
	}

	/**
	 * Returns a String representation of a Card object. The string has the
	 * format "ffs" where ff is the face value (padded with a space, if
	 * necessary) and s is the suit.
	 * 
	 * @return a String representation of a Card object
	 */
	public String toString() {
		String s = "";
		switch (face) {
			case 1:		s += " A";
					break;
			case 11:	s += " J";
					break;
			case 12:	s += " Q";
					break;
			case 13:	s += " K";
					break;
			case 10:	s += "10";
					break;
			default:	s += " " + face;
					break;
		}

		switch (suit) {
			case HEARTS:	s += 'H';
					break;
			case DIAMONDS:	s += 'D';
					break;
			case CLUBS:	s += 'C';
					break;
			case SPADES:	s += 'S';
					break;
		}

		return s;
	}

} 
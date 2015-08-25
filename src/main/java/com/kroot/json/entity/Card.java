package com.kroot.json.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.kroot.json.utils.CardDeserializer;

@JsonDeserialize(using = CardDeserializer.class)
public class Card {

	private int face; // the card's face value, between 1 and 13 inclusive
	private int suit; // the card's suit; one of the class constants

	// class constants for the suits
	public static final int HEARTS = 1;
	public static final int DIAMONDS = 2;
	public static final int CLUBS = 3;
	public static final int SPADES = 4;


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

	public int getFace() {
		return face;
	}

	public int getSuit() {
		return suit;
	}


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
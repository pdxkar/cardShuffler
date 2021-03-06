package com.kroot.json.service;

import java.util.List;

public interface DeckService {
	
	//TODO Make this exercise work without this initialization
	//init tempDatabase
	public List<Deck> initDatabase();
	
	//GET a list of all decks
	public List<Deck> getAll();
	
	//GET an existing deck
	public Deck getDeckById(int id);
	
	//PUT - create a new deck in sorted order
	public Deck createNewDeck();
	
	//POST - shuffle an existing deck
	public Deck shuffleDeckById(int id);
	
	//DELETE - delete an existing deck
	public Boolean deleteDeckById(int id);
}



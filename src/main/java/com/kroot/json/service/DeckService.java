package com.kroot.json.service;

import java.util.List;

public interface DeckService {
	
	//GET a test deck to test Json deserializer
	public Deck getTestDeck();
	
	//GET a list of all decks
	public List<Deck> getAll();
	
	//GET an existing deck
	public Deck getDeckById(int id);
	
	//PUT - create a new deck in sorted order
	public Deck createNewDeck();
	
	//POST - shuffle an existing deck
	public void shuffleDeckById(int id);
	
	//DELETE - delete an existing deck
	public void deleteDeckById(int id);
}


/*public interface StudentService {
	
	public Student getById(int id);

	public List<Student> getAll();
	
	public Student save(Student s);
	
	public Student update(Student s);
	
	public boolean delete(int id);
}

*/
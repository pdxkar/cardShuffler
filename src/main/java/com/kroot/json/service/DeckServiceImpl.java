package com.kroot.json.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kroot.json.utils.TempDatabase;

@Service("DeckService")
public class DeckServiceImpl implements DeckService{
	
	@Autowired
	TempDatabase tempDatabase;
	
	public DeckServiceImpl() {}
	
//	@Override
//	public Deck getTestDeck(){
//		return tempDatabase.getTestDeck();
//	}
	
	//TESTING --- initialize TemporaryDatabase
	@Override
	public List<Deck> initDatabase(){
		tempDatabase = new TempDatabase();
		setTempDatabase(tempDatabase);
		return tempDatabase.initDatabase();
	}
	
	//GET a list of all decks
	@Override
	public List<Deck> getAll(){
		return tempDatabase.getAllDecks();
		
	}
	
	//GET an existing deck
	@Override
	public Deck getDeckById(int id){
		return tempDatabase.getDeckById(id);
		
	}
	
	//PUT - create a new deck in sorted order
	@Override
	public Deck createNewDeck(){
		Deck deck = new Deck();
		return deck;
		
	}
	
	//POST - shuffle an existing deck
	@Override
	public Deck shuffleDeckById(int id){
		return tempDatabase.shuffleDeckById(id);
	}
	
	//DELETE - delete an existing deck
	@Override
	public Boolean deleteDeckById(int id){
		if(tempDatabase.deleteDeckById(id)){
			return true;
			//return "Delete has been perform successfully";
		} else {
			return false;
			//return "Delete fail";
		}
	}

	public TempDatabase getTempDatabase() {
		return tempDatabase;
	}

	public void setTempDatabase(TempDatabase tempDatabase) {
		this.tempDatabase = tempDatabase;
	}

}




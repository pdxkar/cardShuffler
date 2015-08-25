package com.kroot.json.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kroot.json.utils.TempDatabase;

@Service
public class DeckServiceImpl implements DeckService{
	
/*	@Autowired
	TempDatabase tempDatabase;*/
	
	TempDatabase tempDatabase = new TempDatabase();
	
	public DeckServiceImpl() {}
	
	@Override
	public Deck getTestDeck(){
		return tempDatabase.getTestDeck();
	}
	
	//GET a list of all decks
	@Override
	public List<Deck> getAll(){
		//return tempDatabase.getDeck();
		return null;
		
	}
	
	//GET an existing deck
	@Override
	public Deck getDeckById(int id){
		return null;
		
	}
	
	//PUT - create a new deck in sorted order
	@Override
	public Deck createNewDeck(){
		Deck deck = new Deck();
		
		return deck;
		
	}
	
	//POST - shuffle an existing deck
	@Override
	public void shuffleDeckById(int id){
		
	}
	
	//DELETE - delete an existing deck
	@Override
	public void deleteDeckById(int id){
		
	}

}




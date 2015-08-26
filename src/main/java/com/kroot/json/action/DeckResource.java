package com.kroot.json.action;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.kroot.json.service.Deck;
import com.kroot.json.service.DeckService;

@Path("/decks")
public class DeckResource {
	
	@Autowired
	private DeckService deckService;
	
	//TODO Make this exercise work without this initialization
	//TESTING initialize tempDatabase
	@POST
	public String initDatabase() {

		List<Deck> deckList = deckService.initDatabase(); 
		Gson gson = new Gson();
		
		return gson.toJson(deckList);
	}
	
	//GET a list of all decks
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String getAll() {
		List<Deck> deckList = deckService.getAll();  
		Gson gson = new Gson();
		return gson.toJson(deckList);
	}
	
	//GET an existing deck
	@GET
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public String get(@PathParam("param") int id) {
		Deck deck = deckService.getDeckById(id);
		
		if(deck == null){
			System.out.println("Deck with id:" + id + " is not found");
			throw new NotFoundException("Deck with id:" + id + " is not found");
		}
 
		Gson gson = new Gson();
		
		return gson.toJson(deck);
	}
	
	//PUT - create a new deck in sorted order 
	@PUT
	@Produces({MediaType.APPLICATION_JSON})
	public Deck createNewDeck(){
		Deck deck = deckService.createNewDeck(); //move to return statement
		return deck;
	}
	
	//POST - shuffle an existing deck
	@POST
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public Deck shuffleDeckById(@PathParam("param")int id){
		Deck deck = deckService.shuffleDeckById(id);
		
		if(deck == null){
			System.out.println("Deck with id:" + id + " is not found");
			throw new NotFoundException("Deck with id:" + id + " is not found");
		}
		
		return deck;
	}
	
	@DELETE
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/{param}")
	public String deleteDeckById(@PathParam("param")int id){
		
		Gson gson = new Gson();
		
		if(deckService.deleteDeckById(id)){
			return gson.toJson("Deck #" + id + " has been deleted.");
		} else {
			return gson.toJson("Delete of deck #" + id + " failed");
		}

	}

}


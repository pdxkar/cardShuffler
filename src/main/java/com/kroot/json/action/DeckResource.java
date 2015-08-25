package com.kroot.json.action;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.kroot.json.service.Deck;
import com.kroot.json.service.DeckService;
import com.kroot.json.service.DeckServiceImpl;

@Component
@Path("/decks")
public class DeckResource {
	
/*	@Autowired
	private DeckService deckService;*/
	
	private DeckService deckService = new DeckServiceImpl();
	
	//TESTING json deserializer
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Deck testGet() {
		return deckService.getTestDeck();
	}
	
	
/*	//GET a list of all decks
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Deck> getAll() {
 
		return deckService.getAll();
	}*/
	
	//GET an existing deck
	@GET
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public Deck get(@PathParam("param") int id) {
 
		//Student student = studentService.getById(id);
		Deck deck = deckService.getDeckById(id);
		
		if(deck == null){
			throw new NotFoundException("Deck with id:" + id + " is not found");
		}
 
		return deck;
	}
	
	//PUT - create a new deck in sorted order
	@PUT
	@Produces({MediaType.APPLICATION_JSON})
	public Deck createNewDeck(){
		Deck deck = deckService.createNewDeck();
		return deck;
	}
	
	
	//POST - shuffle an existing deck
	
	
	//DELETE - delete an existing deck

}


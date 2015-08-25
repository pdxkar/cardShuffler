package com.kroot.json.utils;

import java.io.IOException;

import com.kroot.json.entity.Card;
import com.kroot.json.service.Deck;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;


public class DeckDeserializer extends JsonDeserializer<Deck> {
	@Override
	public Deck deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode node = jp.getCodec().readTree(jp);
		int id = 0;
		JsonNode idNode = node.get("id");
		
		if(idNode != null){
			id = idNode.asInt();
		}
/*		String firstName = node.get("firstName").asText();
		String lastName = node.get("lastName").asText();*/
		
	//	Card[] cards = node.
/*		public Deck(int deckId, Card[] cards) {
			this.deckId = deckId;
			this.cards = cards;
		}*/
		
	//	Deck.get


		
       // return new Student(id, firstName, lastName);
		return new Deck(id, new Card[52]);
	}
}



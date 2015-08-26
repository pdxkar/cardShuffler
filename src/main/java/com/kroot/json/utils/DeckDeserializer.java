package com.kroot.json.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.kroot.json.entity.Card;
import com.kroot.json.service.Deck;

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

		return new Deck(id, new Card[52]);
	}
}



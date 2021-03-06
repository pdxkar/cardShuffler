package com.kroot.json.utils;

import java.io.IOException;

import com.kroot.json.entity.Card;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;


public class CardDeserializer extends JsonDeserializer<Card> {

	@Override
	public Card deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode node = jp.getCodec().readTree(jp);
		int id = 0;
		JsonNode idNode = node.get("id");
		if(idNode != null){
			id = idNode.asInt();
		}
		int face = node.get("face").asInt();
		int suit = node.get("suit").asInt();
		
		//TODO Make the face and the suit deserialize to their english equivalents!
/*		String face = node.get("face").toString();
		String suit = node.get("suit").toString();*/

        return new Card(face, suit);
	}
}




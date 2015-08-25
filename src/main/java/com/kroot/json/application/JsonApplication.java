package com.kroot.json.application;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.kroot.json.action.DeckResource;

public class JsonApplication extends ResourceConfig {
	
	public JsonApplication(){
		super(
				DeckResource.class,
				JacksonFeature.class
				);
	}

}

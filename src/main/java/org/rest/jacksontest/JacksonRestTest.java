package org.rest.jacksontest;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonRestTest {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Greeting greeting = new Greeting();
		greeting.setContent("Hello, World!");
		
		Link link = new Link();
		link.setHref("http://localhost:8080/greeting?name=World");
		
		Map<String, Link> linkMap = new LinkedHashMap<String, Link>();
		linkMap.put("self", link);
		
		Map<String, Map<String, Link>> linksMap = new LinkedHashMap<String, Map<String,Link>>();
		linksMap.put("_links", linkMap);
		
		greeting.set_links(linkMap);
		
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		mapper.writeValue(new File("greeting.json"), greeting);
		
		Greeting greeting1 = mapper.readValue(new File("greeting.json"), Greeting.class);
		
		System.out.println(greeting1);
	}

}


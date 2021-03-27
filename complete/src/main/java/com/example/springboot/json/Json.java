package com.example.springboot.json;

import org.json.JSONObject;

public class Json {

	public String createJSON(boolean prettyPrint) {    
	    JSONObject tomJsonObj = new JSONObject();
	    tomJsonObj.put("name", "Emmanuel");
	    tomJsonObj.put("birthday", "1990-02-07");
	    tomJsonObj.put("age", 31);
	    tomJsonObj.put("married", false);

	    // Cannot set null directly
	    tomJsonObj.put("Carro", JSONObject.NULL);

	    tomJsonObj.put("Comida Favorita", new String[] { "Galletas", "Carne", "Frituras" });

	    // {"id": 100001, "nationality", "American"}
	    JSONObject passportJsonObj = new JSONObject();
	    passportJsonObj.put("id", 10031224);
	    passportJsonObj.put("nationality", "Mexicana");
	    // Value of a key is a JSONObject
	    tomJsonObj.put("passport", "xxxxxxxxxx");

	    if (prettyPrint) {
	        // With four indent spaces
	        return tomJsonObj.toString(4);
	    } else {
	        return tomJsonObj.toString();
	    }
	}
}

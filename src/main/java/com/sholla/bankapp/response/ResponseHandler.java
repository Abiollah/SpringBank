package com.sholla.bankapp.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.*;

public class ResponseHandler {
	public static ResponseEntity<Object> generateResponse (int responseCode, HttpStatus status, boolean success, String message) {
	Map <String, Object> map = new HashMap <String, Object>();
	map.put("responseCode", responseCode);
	map.put("status", status.value());
	map.put("success", success);
	map.put("message", message);
	//map.put("data", responseObj);  , Object responseObj
	
	return new ResponseEntity<Object>(map, status);
	
	
	
	}

}

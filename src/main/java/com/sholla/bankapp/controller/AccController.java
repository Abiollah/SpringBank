package com.sholla.bankapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.sholla.bankapp.model.BankEntities;
import com.sholla.bankapp.repository.AccRepository;
import com.sholla.bankapp.response.ResponseHandler;


@RestController
@RequestMapping({ "/api/v1" })
public class AccController {

	@Autowired
	private AccRepository service;
	
//	
	
	@PostMapping("/account")
	public ResponseEntity<Object> createUser( @RequestBody BankEntities acc) {
		
		
		try {
			BankEntities savedAcc = service.AddAcc(acc);
			return ResponseHandler.generateResponse(200, HttpStatus.OK, true, "Account retrived Successfully");
		} catch (Exception e) {
			return ResponseHandler.generateResponse(200, HttpStatus.MULTI_STATUS, false, null);
		}
		
		
	}
	
	
	
	@GetMapping("/account")
	public ResponseEntity<Object> acc() {
		try {
			List<BankEntities> list = service.findAll();
			return ResponseHandler.generateResponse(200, HttpStatus.OK, true, "Account retrived Successfully");
		} catch (Exception e) {
			return ResponseHandler.generateResponse(200, HttpStatus.MULTI_STATUS, false, null);
		}
		
	}
	
	
	@PostMapping("/first_acc")
	public ResponseEntity<BankEntities> createTutorial(@RequestBody BankEntities acc) {
		try {
			BankEntities account = service.AddAcc(acc);
			return new ResponseEntity<>(account, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	
}

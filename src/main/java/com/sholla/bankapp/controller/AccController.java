package com.sholla.bankapp.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sholla.bankapp.model.Account;
import com.sholla.bankapp.model.BankEntities;
import com.sholla.bankapp.repository.AccRepository;
import com.sholla.bankapp.repository.BankRepository;
import com.sholla.bankapp.response.ResponseHandler;


@RestController
@RequestMapping({ "/api/v1" })
public class AccController {

	@Autowired
	private AccRepository service;
	
//	@Autowired
//	BankRepository bank;
	
	@PostMapping("/account")
	public ResponseEntity<Object> createUser( @RequestBody BankEntities acc) {
		//Account savedAcc = service.AddAcc(acc);
		
//		URI location = ServletUriComponentsBuilder
//			.fromCurrentRequest()
//			.path("/{accountName}")
//			.buildAndExpand(savedUser.getAccountName()).toUri();
//		
//		return ResponseEntity.created(location).build();
		
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
	
	
	@PostMapping("/tutorials")
	public ResponseEntity<BankEntities> createTutorial(@RequestBody BankEntities tutorial) {
		try {
			BankEntities _tutorial = service
					.AddAcc(new BankEntities(tutorial.getAccountName(), tutorial.getAccountPassword(), tutorial.getInitialDeposit()));
			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
//	@PutMapping("/deposit/{acctID}/withdraw/{amount}")
//	public ResponseEntity<Object> deposit(@PathVariable String accountName, @PathVariable double amount) {
//		
//		
//		try {
//			Account savedAcc = bank.Deposit(accountName, amount);
//			return ResponseHandler.generateResponse(200, HttpStatus.OK, true, "Account retrived Successfully", savedAcc);
//		} catch (Exception e) {
//			return ResponseHandler.generateResponse(200, HttpStatus.MULTI_STATUS, false, null, null);
//		}
//		
//		
//	}
	
}

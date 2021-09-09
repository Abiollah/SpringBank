package com.sholla.bankapp.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sholla.bankapp.model.Account;
import com.sholla.bankapp.repository.AccountRepository;
import com.sholla.bankapp.response.ResponseHandler;



@RestController
@RequestMapping({ "/api/v1" })
public class AccountController {

	//private List<Account> account = createAcc();
	

	@Autowired
	private AccountRepository acc1Repo;


	
	
	@PostMapping("/account_1")
	public ResponseEntity<Object> createAccount ( @RequestBody Account acc) {
		
		try {
			String list = acc1Repo.CreateAccount(acc);
			return ResponseHandler.generateResponse(200, HttpStatus.OK, true, "Account saved Successfully");
		} catch (Exception e) {
			return ResponseHandler.generateResponse(200, HttpStatus.MULTI_STATUS, false, null);
		}
		
	}
	
	
	@GetMapping("/account_1")
	public ResponseEntity<Object> acc() {
		try {
			List<Account> list = acc1Repo.listAccount();
			return ResponseHandler.generateResponse(200, HttpStatus.OK, true, "Account retrived Successfully");
		} catch (Exception e) {
			return ResponseHandler.generateResponse(200, HttpStatus.MULTI_STATUS, false, null);
		}
		
	}
	
	
	
	

}

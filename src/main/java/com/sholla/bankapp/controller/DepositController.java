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
import org.springframework.web.server.ResponseStatusException;

import com.sholla.bankapp.model.BankEntities;
import com.sholla.bankapp.repository.DepositRepository;
import com.sholla.bankapp.response.ResponseHandler;

@RestController
@RequestMapping({ "/api/v1" })
public class DepositController {

	@Autowired
	private DepositRepository depservice;

	@GetMapping("/deposit")
	public ResponseEntity<Object> acc() {
		try {
			List<BankEntities> deposit = depservice.findAll();
			return ResponseHandler.generateResponse(200, HttpStatus.OK, true, "Withdrawal retrived Successfully");
		} catch (Exception e) {
			return ResponseHandler.generateResponse(200, HttpStatus.MULTI_STATUS, false, null);
		}

	}

	@PostMapping("/deposit")
	public ResponseEntity<Object> createdeposit(@RequestBody BankEntities deposit) {
		
		if (deposit.getAmount() >= 100000)
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Amount not accepted");
		else {
			if (deposit.getAmount() < 1.0)
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Amount rejected");
		}

		try {
			BankEntities _deposit = depservice
					.AddDeposit(new BankEntities(deposit.getAccountNumber(), deposit.getAmount()));
			return ResponseHandler.generateResponse(200, HttpStatus.OK, true, "Deposit made Successfully");
		} catch (Exception e) {
			return ResponseHandler.generateResponse(200, HttpStatus.MULTI_STATUS, false, null);
		}
	}

}

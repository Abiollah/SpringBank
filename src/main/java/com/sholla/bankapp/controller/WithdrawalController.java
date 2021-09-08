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

import com.sholla.bankapp.repository.WithdrawalRepository;
import com.sholla.bankapp.response.ResponseHandler;


@RestController
@RequestMapping({ "/api/v1" })
public class WithdrawalController {

	@Autowired
	private WithdrawalRepository widservice;
	
	@GetMapping("/withdrawal")
	public ResponseEntity<Object> acc() {
		try {
			List<BankEntities> withdrawal = widservice.findAll();
			return ResponseHandler.generateResponse(200, HttpStatus.OK, true, "Withdrawal retrived Successfully");
		} catch (Exception e) {
			return ResponseHandler.generateResponse(200, HttpStatus.MULTI_STATUS, false, null);
		}
		
	}
	
	
	@PostMapping("/withdrawal")
	public ResponseEntity<Object> createwithdrawal(@RequestBody BankEntities withdrawal) {
		try {
			BankEntities _withdrawal = widservice.AddWithdraw(new BankEntities(withdrawal.getAccountNumber(), withdrawal.getAccountPassword(), withdrawal.getAmount()));
			return ResponseHandler.generateResponse(200, HttpStatus.OK, true, "Withdrawal saved Successfully");
		} catch (Exception e) {
			return ResponseHandler.generateResponse(200, HttpStatus.MULTI_STATUS, false, null);
		}
	}
	
}

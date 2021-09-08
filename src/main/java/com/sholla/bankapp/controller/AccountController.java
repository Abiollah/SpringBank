//package com.sholla.bankapp.controller;
//
//import java.util.HashMap;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.sholla.bankapp.model.Account;
//import com.sholla.bankapp.repository.AccountRepository;
//import com.sholla.bankapp.response.ResponseHandler;
//import com.sholla.bankapp.service.AccountServiceImpl;
//
//
//@RestController
//@RequestMapping({ "/api/v1" })
//public class AccountController {
//
//	//private List<Account> account = createAcc();
//	@Autowired
//	private AccountServiceImpl accRepo;
//
//	@Autowired
//	private AccountRepository acc1Repo;
//
//
//	
//	
//	@PostMapping("/account")
//	public String createAccount ( @RequestBody Account acc) {
//		return accRepo.CreateAccount(acc);
//		
//	}
//	
//	
//	@GetMapping("/account")
//	public ResponseEntity<Object> acc() {
//		try {
//			List<Account> list = accRepo.listAccount();
//			return ResponseHandler.generateResponse(200, HttpStatus.OK, true, "Account retrived Successfully", list);
//		} catch (Exception e) {
//			return ResponseHandler.generateResponse(200, HttpStatus.MULTI_STATUS, false, null, null);
//		}
//		
//	}
//	
//	
//	
//	
//
//}

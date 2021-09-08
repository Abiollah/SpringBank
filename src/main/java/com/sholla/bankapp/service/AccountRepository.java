//package com.sholla.bankapp.repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import com.sholla.bankapp.model.*;
//import com.sholla.bankapp.response.ResponseHandler;
//
//
//public class AccountRepository {
//	
////	private List<Account> account = accountList();
////	
////	private static List<Account> accountList() {
////		List<Account> newAccount = new ArrayList<>();
////		Account acc1 = new Account();
////		acc1.setAccountName("Balogun Abiola");
////		acc1.setAccountPassword("manager");
////		acc1.setInitialDeposit(800.0);
////		
////
////		Account acc2 = new Account();
////		acc2.setAccountName("Balogun Abiola");
////		acc2.setAccountPassword("manager");
////		acc2.setInitialDeposit(500.0);
////		newAccount.add(acc1);
////		newAccount.add(acc2);
////		return newAccount;
////	}
////	
//	
//	private List<Account> list = new ArrayList<Account>();
//
//	public void getAll() {
//		List<Account> list = List.of(new Account( "Balogun Abiola", "123456", 500.0),
//				new Account("Mary Jane", "746552", 700.87),
//				new Account("Jimoh Yusuf", "Admin", 690.87));
//		for (Account account : list) {
//			list.add(account);
//		}
//
//	}
//	
////	@PostMapping("/account")
////	public Account create(@RequestBody Account acc) {
////		account.contains(acc.getAccountName());
////		account.add(acc);
////		return acc;
////	}
//	
//	public List<Account> listAccount() {
//		return list;
//	}
//
//	public List<Account> search(String accountName) {
//		return list.stream().filter(x -> x.getAccountName().startsWith(accountName)).collect(Collectors.toList());
//	}
//
//	public String CreateAccount (Account acc) {
//		Account obj = new Account ();
//		obj.setAccountName(acc.getAccountName());
//		obj.setAccountNumber(acc.getAccountNumber());
//		obj.setAccountPassword(acc.getAccountPassword());
//		obj.setBalance(acc.getBalance());
//		
//		list.add(obj);
//		return null;
//	}
//
//	public String deleteAccount (String accountName) {
//		list.removeIf(x -> x.getAccountName() == (accountName));
//		return null;
//	}
//
//
//	
//
//}

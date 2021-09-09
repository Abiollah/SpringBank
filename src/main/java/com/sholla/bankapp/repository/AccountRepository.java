package com.sholla.bankapp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;


import com.sholla.bankapp.model.*;



@Component
public class AccountRepository {
	
	public static double initialDeposit = 500.00;
	
	private List<Account> list = new ArrayList<Account>();
	
	public List<Account> account = createAcc();

	public void getAll() {
		List<Account> list = List.of(new Account( "Balogun Abiola", "123456", 500.0),
				new Account("Mary Jane", "746552", 700.87),
				new Account("Jimoh Yusuf", "Admin", 690.87));
		for (Account account : list) {
			list.add(account);
		}

	}
	
//	@PostMapping("/account")
//	public Account create(@RequestBody Account acc) {
//		account.contains(acc.getAccountName());
//		account.add(acc);
//		return acc;
//	}
	
	public List<Account> listAccount() {
		return list;
	}

	public List<Account> search(String accountName) {
		return list.stream().filter(x -> x.getAccountName().startsWith(accountName)).collect(Collectors.toList());
	}

	public String CreateAccount (Account acc) {
		Account obj = new Account ();
		obj.setAccountName(acc.getAccountName());
		//obj.setAccountNumber(acc.getAccountNumber());
		obj.setAccountPassword(acc.getAccountPassword());
		obj.setInitialDeposit(acc.getInitialDeposit());
		
		list.add(obj);
		return null;
	}
	
	public List<Account> ListAcc() {
		return account;
	}
	
	private static List<Account> createAcc() {
		List<Account> account = new ArrayList<>();
		Account acc1 = new Account();
		acc1.setAccountName("Access Bank");
		acc1.setAccountPassword("265403");
		acc1.setInitialDeposit(800.0);
		
		Account acc2 = new Account();
		acc2.setAccountName("Diamond");
		acc2.setAccountPassword("7476");
		acc2.setInitialDeposit(600.0);
		
		
		return account;
	}

	public String deleteAccount (String accountName) {
		list.removeIf(x -> x.getAccountName() == (accountName));
		return null;
	}


	

}

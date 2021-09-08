package com.sholla.bankapp.service;




import org.springframework.stereotype.Service;

import com.sholla.bankapp.model.Account;

@Service
public interface AccountService {

public abstract void getAll(); 
	
//	public abstract List<Account> listAccount();
//
//	public abstract List<Account> search(String name);
//
//	public abstract String CreateAccount(Account acc);
//	
//	public abstract String delete (String accountName);


public void saveAccount(String accName, String accPassword, Double initialDeposit);

public void withdraw(String accNumber, String accPassword, Double amount);

public void deposit (String accNumber,  Double amount);


	
	
}

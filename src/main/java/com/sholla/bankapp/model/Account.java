package com.sholla.bankapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Account {
	private String accountName;
	private String accountPassword;
	private Double initialDeposit;
	
	@JsonIgnore
	private String accountNumber;
	
	@JsonIgnore
    private Double balance;
    
    
	public Account() {
	}


	public Account(String accountName, String accountPassword, Double initialDeposit, String accountNumber,
			Double balance) {
		super();
		this.accountName = accountName;
		this.accountPassword = accountPassword;
		this.initialDeposit = initialDeposit;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public Account(String accountName, String accountPassword, Double initialDeposit) {
		super();
		this.accountName = accountName;
		this.accountPassword = accountPassword;
		this.initialDeposit = initialDeposit;
		
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public String getAccountPassword() {
		return accountPassword;
	}


	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}


	public Double getInitialDeposit() {
		return initialDeposit;
	}


	public void setInitialDeposit(Double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}
    

}

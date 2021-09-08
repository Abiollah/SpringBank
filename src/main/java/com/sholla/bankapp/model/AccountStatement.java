package com.sholla.bankapp.model;

import java.util.Date;

public class AccountStatement {
	
	private Date transactionDate;
	private String transactionType;
    private String narration;
    private Double amount;
    private Double accountBalance;
    
    
	public AccountStatement() {
	}


	public AccountStatement(Date transactionDate, String transactionType, String narration, Double amount,
			Double accountBalance) {
	
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.narration = narration;
		this.amount = amount;
		this.accountBalance = accountBalance;
	}


	public Date getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public String getNarration() {
		return narration;
	}


	public void setNarration(String narration) {
		this.narration = narration;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public Double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

}

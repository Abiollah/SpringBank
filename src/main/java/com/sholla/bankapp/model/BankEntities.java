package com.sholla.bankapp.model;



import java.util.Date;



public class BankEntities {
	
	private String accountName;
	private String accountPassword;
	private double initialDeposit;
	private String accountNumber;
    private Double balance;
    
	private double amount;
	private Double withdrawnAmount;
	private String TransactionType;
	private String narration;
    private Date TransactionDate;
    
    public BankEntities() {
		super();
		
	}
    
    public BankEntities (String accountName, String accountPassword, Double initialDeposit) {
		super();
		this.accountName = accountName;
		this.accountPassword = accountPassword;
		this.initialDeposit = initialDeposit;	
	}
    
    
	public BankEntities(String accountPassword, String accountNumber, double amount) {
		super();
		this.accountPassword = accountPassword;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	
	


	public BankEntities(String accountNumber, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
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
	public double getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(double initialDeposit) {
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Double getWithdrawnAmount() {
		return withdrawnAmount;
	}
	public void setWithdrawnAmount(Double withdrawnAmount) {
		this.withdrawnAmount = withdrawnAmount;
	}
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public Date getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		TransactionDate = transactionDate;
	}
    

}


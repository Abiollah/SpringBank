package com.sholla.bankapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sholla.bankapp.model.BankEntities;


@Component
public class WithdrawalRepository {
	
	private static List<BankEntities> withdrawal = new ArrayList<>();

	static {
		withdrawal.add(new BankEntities("Balogun Abiola", "123456", 500.0));
		withdrawal.add(new BankEntities("Mary Jane", "746552", 700.87));
		withdrawal.add(new BankEntities("Jimoh Yusuf", "Admin", 690.87));
	}

	
	
	
	
	public BankEntities AddWithdraw(BankEntities acc) {
		withdrawal.add(acc);
		return acc;
	}
	
	 
	public List<BankEntities> findAll() {
		return withdrawal;
	}



}

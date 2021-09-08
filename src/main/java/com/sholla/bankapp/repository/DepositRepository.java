package com.sholla.bankapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sholla.bankapp.model.BankEntities;


@Component
public class DepositRepository {
	
	private static List<BankEntities> deposit = new ArrayList<>();

	static {
		deposit.add(new BankEntities("Balogun Abiola", 500.0));
		deposit.add(new BankEntities("Mary Jane", 700.87));
		deposit.add(new BankEntities("Jimoh Yusuf", 690.87));
	}

	
	
	
	
	public BankEntities AddDeposit(BankEntities acc) {
		deposit.add(acc);
		return acc;
	}
	
	 
	public List<BankEntities> findAll() {
		return deposit;
	}


}

package com.sholla.bankapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sholla.bankapp.model.Account;
import com.sholla.bankapp.model.BankEntities;

@Component
public class AccRepository {

	private static List<BankEntities> acct = new ArrayList<>();

	static {
		acct.add(new BankEntities("Balogun Abiola", "123456", 500.0));
		acct.add(new BankEntities("Mary Jane", "746552", 700.87));
		acct.add(new BankEntities("Jimoh Yusuf", "Admin", 690.87));
	}

	
	static String getAlphaNumericString(int n)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz";
  
       
        StringBuilder sb = new StringBuilder(n);
  
        for (int i = 0; i < n; i++) {
  
            int index
                = (int)(AlphaNumericString.length()
                        * Math.random());
            sb.append(AlphaNumericString
                          .charAt(index));
        }
  
        return sb.toString();
    }
	
	static  int n = 10;
	static  int deposit = 500;
	
	public BankEntities AddAcc(BankEntities acc) {
		acc.setAccountName(AccRepository.getAlphaNumericString(n));
		acct.add(acc);
		return acc;
	}
	
	 
	public List<BankEntities> findAll() {
		return acct;
	}
}

//package com.sholla.bankapp.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.sholla.bankapp.model.Account;
//import com.sholla.bankapp.repository.AcccountRepos;
//
//
//@Service
//public class AccountServiceImpl implements AccountService {
//	
//	@Autowired
//	private AcccountRepos accRepo;
//	//private AccountRepository accRepo;
//
//	@Override
//	public void getAll() {
//		
//		accRepo.getAll();
//		
//	}
//
//	@Override
//	public List<Account> listAccount() {
//		// TODO Auto-generated method stub
//		return accRepo.listAccount();
//	}
//
//	@Override
//	public List<Account> search(String accountName) {
//		// TODO Auto-generated method stub
//		return accRepo.search(accountName);
//	}
//
//	@Override
//	public String CreateAccount(Account acc) {
//		// TODO Auto-generated method stub
//		return accRepo.CreateAccount(acc);
//	}
//
//	@Override
//	public String delete(String accountName) {
//		// TODO Auto-generated method stub
//		return accRepo.deleteAccount(accountName);
//	}
//
//}

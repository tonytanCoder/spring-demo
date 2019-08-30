package com.example.ioc;

public class AccountService {

	public AccountDao accountDao;
	
	public AccountService(AccountDao accountDao){
		this.accountDao=accountDao;
	}
	
	
	public Long qryAccountId(){
		return accountDao.qryAccountId();
	}
}

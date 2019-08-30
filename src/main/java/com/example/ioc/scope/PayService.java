package com.example.ioc.scope;

import org.springframework.beans.factory.annotation.Autowired;

public class PayService {

	@Autowired
	private PayDao payDao;
	
	 public String insertRecord(String record){
		 return payDao.insertRecord(record);
	 }

	public PayDao getPayDao() {
		return payDao;
	}

	public void setPayDao(PayDao payDao) {
		this.payDao = payDao;
	}
	 
	 
}

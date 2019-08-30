package com.example.ioc.scope;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeDemo {
public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("config/beans-scopes.xml");
	 PayService payService = (PayService) context.getBean("payService");
	 System.out.println(payService.insertRecord("tzL"));
	 
	 FactoryBean FactoryBean ;
}
}

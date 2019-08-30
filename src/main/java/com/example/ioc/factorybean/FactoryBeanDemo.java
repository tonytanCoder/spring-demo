package com.example.ioc.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanDemo {
public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("config/beans-beanfatory.xml");
	 Userservice userservice = (Userservice) context.getBean("factorybean");
	 userservice.show();
}
}

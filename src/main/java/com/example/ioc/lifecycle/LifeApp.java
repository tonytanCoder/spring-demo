package com.example.ioc.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeApp {
	public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/services.xml");
      /*  applicationContext.start();
        applicationContext.close();*/
	}
}

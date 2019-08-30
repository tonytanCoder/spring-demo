package com.example.ioc.beanlife;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanLifeDemo {
	public static void main(String[] args) {
		 //1、创建ioc容器
	    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
	    applicationContext.scan("com.example.ioc.beanlife");
	    applicationContext.refresh();
	    System.out.println("容器创建完成...");
	    applicationContext.getBean("settleService");
	    //关闭容器
	    applicationContext.close();
	}
}

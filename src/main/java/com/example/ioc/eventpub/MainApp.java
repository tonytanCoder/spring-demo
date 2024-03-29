package com.example.ioc.eventpub;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	   public static void main(String[] args) {
		      ConfigurableApplicationContext context = 
		         new ClassPathXmlApplicationContext("config/beans-beaneventpub.xml");
			  
		      CustomEventPublisher cvp = 
		         (CustomEventPublisher) context.getBean("customEventPublisher");
		      
		      cvp.publish();  
		      cvp.publish();
		   }
}

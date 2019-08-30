package com.example.ioc.beanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,
        InitializingBean,DisposableBean 
 * @author LS-0323
 *
 */
public class BeanPostProcessorDemo {
public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("config/beans-beanpostprocessor.xml");
	 BankService bankService = (BankService) context.getBean("bankService");
	 System.out.println(bankService.verifyBankCard("455555"));
}
}

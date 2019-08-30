package com.example.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

import com.example.ioc.scope.ThreadScope;

public class BeanRegAndDiDemo {
 public static void main(String[] args) {
	 DefaultListableBeanFactory beanReg=new DefaultListableBeanFactory();
	 beanReg.registerScope("thread", new ThreadScope());
	 BeanFactory container=bindViaCode(beanReg);
	 AccountService accountService=(AccountService) container.getBean("accountService");
     System.out.println(accountService.qryAccountId());
}
 
 public static BeanFactory bindViaCode(BeanDefinitionRegistry beanDefinitionRegistry){
	 AbstractBeanDefinition accountDao=new RootBeanDefinition(AccountDao.class);
	 AbstractBeanDefinition accountService=new RootBeanDefinition(AccountService.class);
	 accountService.setScope("thread");
	 /**
	  * 将bean定义注册到容器
	  */
	 beanDefinitionRegistry.registerBeanDefinition("accountDao", accountDao);
	 beanDefinitionRegistry.registerBeanDefinition("accountService", accountService);
	 
	 ConstructorArgumentValues constructorArgumentValues=new ConstructorArgumentValues();
	 constructorArgumentValues.addIndexedArgumentValue(0, accountDao);
	 accountService.setConstructorArgumentValues(constructorArgumentValues);
	 return (BeanFactory) beanDefinitionRegistry;
 }
}

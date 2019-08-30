package com.example.ioc.beanlife;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class SettleService implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean,
		DisposableBean {
	// Seat也是一个简单的bean对象
	private BalanceService balanceService;

	public SettleService() {
		System.out.println("balanceService instance...");
	}

	public BalanceService getBalanceService() {
		return balanceService;
	}

	@Autowired
	public void setBalanceService(BalanceService balanceService) {
		System.out.println("填充属性");
		this.balanceService = balanceService;
	}

	/**
	 * 自定义的初始化方法
	 */
	@PostConstruct
	public void init() {
		System.out.println("balanceService ... init...");
	}

	/**
	 * 自定义的销毁方法
	 */
	 @PreDestroy
	public void detory() {
		System.out.println("balanceService ... detory...");
	}

	@Override
	public void setBeanName(String s) {
		System.out.println(s);
		System.out.println("BeanNameAware...setBeanName()");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("DisposableBean...setBeanFactory()");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware...setApplicationContext()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean...afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("InitializingBean...destroy()");
	}
}
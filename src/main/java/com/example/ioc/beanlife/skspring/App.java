package com.example.ioc.beanlife.skspring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {
		/* ApplicationContext context = new ClassPathXmlApplicationContext("config/beans-skspring-beanlife.xml");
		 context.addBeanPostProcessor(new LifeCycleBean());
		 LifeCycleBean lifeCycleBean = (LifeCycleBean) context.getBean("lifeCycle");*/
		

		 System.out.println("方法调用完成，容器开始关闭....");
		 // 关闭容器
		/* factory.destroySingletons();*/
		 Resource resource = new ClassPathResource("config/beans-skspring-beanlife.xml");
		 ConfigurableBeanFactory factory = new XmlBeanFactory(resource);
		 factory.addBeanPostProcessor(new LifeCycleBean());
		 LifeCycleBean lifeCycleBean = (LifeCycleBean) factory.getBean("lifeCycle");
		 lifeCycleBean.display();

		 System.out.println("方法调用完成，容器开始关闭....");
		 // 关闭容器
		 factory.destroySingletons();
	}
}

package com.example.ioc.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**beans-beanpostprocessor.xml
 * @author LS-0323
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	 @Override
	    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	        System.out.println("postProcessBeforeInitialization..."+beanName+"..."+bean);
	        return bean;
	    }

	    @Override
	    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	        System.out.println("postProcessAfterInitialization..."+beanName+"..."+bean);
	        return bean;
	    }
}

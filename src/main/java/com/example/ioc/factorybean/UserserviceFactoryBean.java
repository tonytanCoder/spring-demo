package com.example.ioc.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class UserserviceFactoryBean implements FactoryBean<Userservice>{

	@Override
	public Userservice getObject() throws Exception {
		System.out.println(" 委托工厂方法获取实例 ");
		return new Userservice();
	}

	@Override
	public Class<?> getObjectType() {
		return Userservice.class;
	}

}

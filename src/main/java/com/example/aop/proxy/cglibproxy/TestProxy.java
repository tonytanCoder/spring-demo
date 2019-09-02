package com.example.aop.proxy.cglibproxy;

import org.junit.Test;

import com.example.aop.proxy.staticproxy.UserDao;

public class TestProxy {
	   @Test
	    public void testCglibProxy(){
	        //目标对象
	        UserDao target = new UserDao();
	        System.out.println(target.getClass());
	        //代理对象
	        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
	        System.out.println(proxy.getClass());
	        //执行代理对象方法
	        proxy.save();
	    }
}

package com.example.aop.proxy.jdkproxy;

import org.junit.Test;

import com.example.aop.proxy.staticproxy.IUserDao;
import com.example.aop.proxy.staticproxy.UserDao;

public class TestProxy {
    @Test
    public void testDynamicProxy (){
    	System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        IUserDao target = new UserDao();
        System.out.println(target.getClass());  //输出目标对象信息
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());  //输出代理对象信息
        proxy.save();  //执行代理方法
    }
}

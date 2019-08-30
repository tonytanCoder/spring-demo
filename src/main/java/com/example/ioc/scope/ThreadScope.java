package com.example.ioc.scope;

import java.util.HashMap;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope{
	
	private final ThreadLocal treadScope=new ThreadLocal(){
	    protected Object initialValue() {
	        return new HashMap<>();
	    }
	};

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		System.out.println(" .......开始获取对象......");
		HashMap<String,Object> sc=(HashMap<String,Object>) treadScope.get();
		Object object=sc.get(name);
		if(object==null){
			object=objectFactory.getObject();
			sc.put(name, object);
		}
		return object;
	}

	@Override
	public Object remove(String name) {
		HashMap<String,Object> sc=(HashMap<String,Object>) treadScope.get();
		return sc.remove(name);
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object resolveContextualObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getConversationId() {
		return Thread.currentThread().getName();
	}

}

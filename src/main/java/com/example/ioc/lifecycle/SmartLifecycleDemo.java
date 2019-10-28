package com.example.ioc.lifecycle;

import org.springframework.context.SmartLifecycle;

public class SmartLifecycleDemo implements SmartLifecycle{
	 private volatile boolean running = false;
	
	 public SmartLifecycleDemo() {
	        System.out.println("构造方法!!!");
	    }

	   
	    @Override
	    public void start() {
	        System.out.println("SmartLifecycleDemo lifycycle start");
	        running = true;

	    }
	   @Override
	    public void stop() {
	        System.out.println("SmartLifecycleDemo lifycycle stop");
	        running = false;
	    }

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public int getPhase() {
		return -1;
	}

	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public void stop(Runnable callback) {
		
	}

}

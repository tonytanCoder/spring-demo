package com.example.ioc.lifecycle;

import org.springframework.context.Lifecycle;

public class HelloLifeCycle implements Lifecycle {
    private volatile boolean running = false;

    public HelloLifeCycle() {
        System.out.println("构造方法!!!");
    }

   
    @Override
    public void start() {
        System.out.println("lifycycle start");
        running = true;

    }
   @Override
    public void stop() {
        System.out.println("lifycycle stop");
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }
}
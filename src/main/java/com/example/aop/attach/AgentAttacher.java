package com.example.aop.attach;

import java.io.IOException;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

public class AgentAttacher {
	 public static void main(String[] args) throws AttachNotSupportedException, IOException, AgentLoadException, AgentInitializationException {
	        VirtualMachine vm = VirtualMachine.attach("9664"); // 目标 JVM pid
	        vm.loadAgent("F://agent2/agent-demo.jar");
	    }
}

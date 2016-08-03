package com.pushpa.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://service.pushpa.com/", portName = "HelloServicePort", serviceName = "HelloServiceService")
public class HelloService {
	
	public String sayHello()
	{
		return "Hello !!";
		
	}

}

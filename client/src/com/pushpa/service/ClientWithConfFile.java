package com.pushpa.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientWithConfFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cntxt = new ClassPathXmlApplicationContext("cxf.xml");
		
		HelloService service = (HelloService) cntxt.getBean("helloservice");
		
		System.out.println(service.sayHello());
		
		

	}

}

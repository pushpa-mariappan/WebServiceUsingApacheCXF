package com.pushpa.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class TestClient {
	
	public static void main(String args[]){
		
		JaxWsProxyFactoryBean factory  = new JaxWsProxyFactoryBean();
		factory.setAddress("http://localhost:8080/ApacheCXFforJAXWS/services/HelloServicePort");
		factory.setServiceClass(HelloService.class);
		
		HelloService service = (HelloService) factory.create();
		System.out.println(service.sayHello());
	}

}

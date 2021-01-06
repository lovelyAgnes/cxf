package com.cxfClient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cxfserver.HelloWorld;

public class Test {

	/**
	 * cmd导入
	 * wsimport -s E:\eclipse\workspace\cxfClient\src\main\java -keep http://localhost:8088/cxfServer/cxf/helloworld?wsdl
	 * */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
		        HelloWorld client = (HelloWorld)context.getBean("client");		
		        String response = client.sayHi("Joe");
		        System.out.println("response:"+response);
		        System.exit(0);

	}

}

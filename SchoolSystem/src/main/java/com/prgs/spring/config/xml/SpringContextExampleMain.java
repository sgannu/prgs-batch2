package com.prgs.spring.config.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextExampleMain {


	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
		    	  new ClassPathXmlApplicationContext(new String[] {"spring-config.xml"});

		ServiceOne service = applicationContext.getBean(ServiceOne.class);
		ServiceTwo service2 = (ServiceTwo) applicationContext.getBean("serviceTwoId");
		service.test();
		service2.test();
	}
}

package com.prgs.spring.config.autoscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContextExampleMain {


	public static void main(String[] args) {
		// ServiceOne service = new ServiceOne();
		
	AnnotationConfigApplicationContext applicationContext 
	= new AnnotationConfigApplicationContext(SpringConfig.class);

	ServiceOne service = applicationContext.getBean(ServiceOne.class);
		service.test();
	}
}

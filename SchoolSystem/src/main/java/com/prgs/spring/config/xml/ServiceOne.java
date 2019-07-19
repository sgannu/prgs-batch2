package com.prgs.spring.config.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class ServiceOne {

	private ServiceTwo service;
	
	public void test() {
		System.out.println("ServiceOne - test");
		service.test();
	}
	
	public void setService(ServiceTwo service) {
		this.service = service;
	}
}

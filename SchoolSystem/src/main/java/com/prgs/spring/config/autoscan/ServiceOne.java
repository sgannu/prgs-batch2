package com.prgs.spring.config.autoscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ServiceOne {

	@Autowired
	ServiceTwo service;
	
	public void test() {
		System.out.println("ServiceOne - test");
		service.test();
	}
}

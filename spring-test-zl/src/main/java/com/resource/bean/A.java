package com.resource.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class A {

	@Autowired
	Z z;
	public A(){
		System.out.println("create a");
	}

	public Z getZ() {
		return z;
	}




}

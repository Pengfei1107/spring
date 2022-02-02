package com.resource.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.PublicKey;

@Component
public class M {

	public M(){
		System.out.println("crate m");
	}

	@Autowired
	N n;


}

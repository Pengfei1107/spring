package com.resource.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class N {

	public N(){
		System.out.println("crate n");
	}

	@Autowired
	M m;
}

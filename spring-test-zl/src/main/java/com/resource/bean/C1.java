package com.resource.bean;

import org.springframework.stereotype.Component;

@Component
public class C1 implements C{
	@Override
	public void methodc() {
		System.out.println("c1#methodc");
	}
}

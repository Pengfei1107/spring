package com.shadow.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("-----------------");
		AnnotationConfigApplicationContext
				annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext("com.shadow");

	}
}

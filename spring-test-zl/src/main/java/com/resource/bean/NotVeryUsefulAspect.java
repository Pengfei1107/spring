package com.resource.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class NotVeryUsefulAspect {

	@Pointcut("within(com.resource.bean.X)")
	public void pointCut(){

	}



	@Before("pointCut()")
	public void doAccessCheck() {
		System.out.println("aop befrore");
	}
}

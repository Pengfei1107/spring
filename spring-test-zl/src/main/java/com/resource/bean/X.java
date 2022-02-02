package com.resource.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class X implements ApplicationContextAware, BeanNameAware, InitializingBean {

	ApplicationContext applicationContext;


	public X(){
		System.out.println("create x default");
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("applicationContext call back");
		this.applicationContext=applicationContext;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName call back");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("lifecycle  callback from  InitializingBean");
	}



	@PostConstruct
	public void JSRInitMethod(){
		System.out.println("JSR-250 Annotation init");
	}

	public void testAop(){
		System.out.println("xbean -----------service");
	}
}

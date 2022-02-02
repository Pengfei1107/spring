package com.luban;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author 钢牌讲师--子路
 **/
public class Test {
	public static void main(String[] args) {
		//实例化App对象（是一个代理对象---增强，修改）然后调用里面加了@Bean的方法
		AnnotationConfigApplicationContext ac= new AnnotationConfigApplicationContext();
		ac.register(App.class);
		ac.refresh();


		App bean = ac.getBean(App.class);
		System.out.println(bean);
	}
}

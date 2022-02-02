package com.luban;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author 钢牌讲师--子路
 **/

@Component
public class TestBean1 {

	public TestBean1(){
		System.out.println("create testBean1");
	}

	@Bean
	public TestBean3 testBean3(){
		return  new TestBean3();
	}
}

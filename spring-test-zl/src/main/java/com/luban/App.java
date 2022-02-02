package com.luban;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 钢牌讲师--子路
 *
 *
 *
 * 第一诫（郑伊健）
 * 警察相信世界上没有鬼
 *
 *
 * 代码永远不会骗人
 *
 *
 * 创建对象一定会调用构造方法
 * testBean1()一定会调用 --->一定会创建一个TestBean1对象
 * testBean2()一定会调用--->testBean1(); 再次调用一次--创建一个新的TestBean1对象
 * 和TestBean2对象
 *
 **/
@Configuration
@ComponentScan("com.luban")
public class App implements ApplicationContextAware {


	@Autowired
	ApplicationContext applicationContext;

	public TestBean1 testBean1(){
		return  new TestBean1();
	}


	@Bean
	public TestBean2 testBean2(){
		testBean1();
		return  new TestBean2();
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}
}

package com.resource.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @Author 钢牌讲师--子路
 **/
@Component
public class LubanBeanPostProcessor implements BeanPostProcessor {


	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("----------------------");
		return bean;
	}
}

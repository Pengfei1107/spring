package com.resource.util;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author 钢牌讲师--子路
 **/
public interface MyBeanPostProcessor extends BeanPostProcessor {

	public Object myMethod(Object bean, String beanName) throws IllegalAccessException;
}

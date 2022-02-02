package com.resource.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Author 钢牌讲师--子路
 **/
public class MyBeanPostProcessorImpl implements MyBeanPostProcessor{
	ApplicationContext applicationContext;
	//属性填充的被调用

	@Override
	public Object myMethod(Object bean, String beanName) throws IllegalAccessException {
//		Class<?> aClass = bean.getClass();
//		Field[] declaredFields = aClass.getDeclaredFields();
//		for (Field declaredField : declaredFields) {
//			Autowired annotation = declaredField.getAnnotation(Autowired.class);
//			if(annotation!=null){
//				Class<?> type = declaredField.getType();
//				Object bean1 = applicationContext.getBean(type);
//				declaredField.set(bean,bean1);
//			}
//		}
		return bean ;
	}
}

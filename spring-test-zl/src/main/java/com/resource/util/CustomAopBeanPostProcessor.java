package com.resource.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author 钢牌讲师--子路
 **/

public class CustomAopBeanPostProcessor implements BeanPostProcessor {


	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		Class<?>[] interfaces = bean.getClass().getInterfaces();
		Object proxyBean;
		if (interfaces.length>0){//spring 會去根據ponitCut進行過濾
			proxyBean = Proxy.newProxyInstance(this.getClass().getClassLoader(),interfaces,new CustomInvocationHandler(bean));

			return proxyBean;
		}
		return bean;
	}




	class CustomInvocationHandler implements InvocationHandler{
		Object target;
		public CustomInvocationHandler(Object target){
			this.target=target;
		}
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("before aop 自定义");
			Object invoke = method.invoke(target, args);
			System.out.println("after aop 自定义");
			return invoke;
		}
	}
}

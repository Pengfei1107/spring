package com.resource.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostPorcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		AbstractBeanDefinition x = (AbstractBeanDefinition) beanFactory.getBeanDefinition("x");
//		//0=AUTOWIRE_NO 1=AUTOWIRE_BY_NAME 2=AUTOWIRE_BY_TYPE 3=AUTOWIRE_CONSTRUCTOR 4=AUTOWIRE_AUTODETECT
//		System.out.println(x.getAutowireMode());
//		x.setAutowireMode(3);
//		System.out.println(x.getAutowireMode());
	}
}

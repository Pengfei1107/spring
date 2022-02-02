package com.shadow.custom;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

public class CustomScanerPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		ClassPathCustomBeanScaner classPathCustomBeanScaner = new ClassPathCustomBeanScaner(registry);
		classPathCustomBeanScaner.addIncludeFilter(new CustomFilter());
		int scan = classPathCustomBeanScaner.scan("com.shadow.zl");
		System.out.println(scan);

	}


	/**
	 * 不需要重写
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}

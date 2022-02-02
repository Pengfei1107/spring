package com.shadow.custom;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.classreading.MetadataReader;

import java.io.IOException;

/**
 * 1、扫描特定的注解
 */
public class ClassPathCustomBeanScaner  extends ClassPathBeanDefinitionScanner {
	public ClassPathCustomBeanScaner(BeanDefinitionRegistry registry) {
		super(registry);
	}



}

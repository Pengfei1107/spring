package com.shadow.util;

import com.shadow.dao.TestDao;
import com.shadow.dao.UserDao;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

public class LubanImportBeanDefinitionRegistart implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		/**
		 * 调用 lubanFactoryBean 默认构造方法
		 *
		 *  注入了一个 BeanDefinitionRegistryPostProcessor
		 *
		 *  扫描 ---set
		 *  for
		 *
		 */

		List<Class> list = new ArrayList<>();
		list.add(UserDao.class);
		list.add(TestDao.class);

		for (Class aClass : list) {
			BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(LubanFactoryBean.class);
			AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
			beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(aClass.getName());
			registry.registerBeanDefinition(aClass.getSimpleName(),beanDefinition);
		}



	}
}

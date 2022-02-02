package com.shadow.service;

import com.shadow.util.LubanFactoryBean;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 主要是演示 把一个类 交给spring管理
 * 不适用扫描 xml @bean 或者@Service
 */
public class XImport implements ImportBeanDefinitionRegistrar {
	/**
	 * 自己定义一个bd---x
	 * 然后把这个x--bd放到 put到bdMap
	 * @param importingClassMetadata annotation metadata of the importing class
	 * @param registry current bean definition registry
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(LubanFactoryBean.class);
		AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
		/**
		 * 上面方法以及可以把 LubanFactoryBean生效（实例化并且在spring容器当中）
		 * 但是这样，没有意义
		 */
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.shadow.dao.TestDao");




		registry.registerBeanDefinition("t",beanDefinition);

	}
}

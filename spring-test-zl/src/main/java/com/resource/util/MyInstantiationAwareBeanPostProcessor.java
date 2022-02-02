package com.resource.util;

import com.resource.bean.A;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author 钢牌讲师--子路
 **/
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if(bean instanceof A)
			return false;
		return true;
	}
}

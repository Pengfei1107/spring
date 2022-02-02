package com.resource.bean;

import org.springframework.stereotype.Component;

/**
 * @Author 钢牌讲师--子路
 **/
@Component
public class TestAopBean implements AopBean {
	@Override
	public void aspectMethod() {
		System.out.println("TestAopBean#aspectMethod");
	}
}

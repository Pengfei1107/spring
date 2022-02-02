package com.shadow.util;

import com.shadow.dao.TestDao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 主要是为了产生一个代理对象
 * 是代理TestDao
 */


public class LubanFactoryBean implements FactoryBean {


	Class mapperInterface;

	public LubanFactoryBean(){

	}

	public LubanFactoryBean(Class mapperInterface){
		this.mapperInterface=mapperInterface;
	}


	@Override
	public Object getObject() throws Exception {
		Object dao =  LubanSqlSession.getMapper(mapperInterface);
		return dao;
	}

	public void setMapperInterface(Class mapperInterface) {
		this.mapperInterface = mapperInterface;
	}

	@Override
	public Class<?> getObjectType() {
		return mapperInterface;
	}
}

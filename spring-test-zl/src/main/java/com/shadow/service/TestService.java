package com.shadow.service;

import com.shadow.dao.TestDao;
import com.shadow.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {

	/**
	 * 1、他必须是一个对象
	 * 2、这个对象必须实现TestDao接口
	 * mybatis保证?
	 * 3、然后还在spring容器当中----把一个第三方的对象交给spring管理
	 * mybatis-spring
	 */
//	@Autowired
//	TestDao testDao;
//
//	@Autowired
//	UserDao userDao;

	public void query(){
//		testDao.query();
//		userDao.query();
//
	}
}

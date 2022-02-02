package com.shadow.app;


import com.shadow.dao.TestDao;
import com.shadow.service.TestService;
import com.shadow.service.X;
import com.shadow.util.LubanFactoryBean;
import com.shadow.util.LubanSqlSession;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.jta.TransactionFactory;

import javax.sql.DataSource;

/**
 * 1、关于如何扩展 BeanFactoryPostProcessor
 * 		mybatis如何扩展的spring
 * 	    ssm应用来讲
 *
 * 	    mybatis的核心源码
 * 	    mybatis-spring的源码
 * 	    spring的生命周期
 */
public class Test {
	public static void main(String[] args) {


		/**
		 * mybatis是不是这种做法
		 */
		//TestDao dao = (TestDao) LubanSqlSession.getMapper(TestDao.class);

		AnnotationConfigApplicationContext ac
				=new AnnotationConfigApplicationContext(App.class);


		ac.getBean(TestService.class).query();


	}

}

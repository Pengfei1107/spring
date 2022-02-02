package com.shadow.app;

import com.mysql.jdbc.Driver;
import com.shadow.custom.CustomImportBeanDefinitionRegistrar;
import com.shadow.dao.TestDao;
import com.shadow.service.XImport;
import com.shadow.util.LubanFactoryBean;
import com.shadow.util.LubanImportBeanDefinitionRegistart;
import com.shadow.util.LubanScan;
import com.shadow.util.LubanSqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
@MapperScan("com.shadow.dao")
@ComponentScan("com.shadow")
public class App {

//	@Bean
//	public LubanFactoryBean factoryBean(){
//
//		LubanFactoryBean lubanFactoryBean = new LubanFactoryBean(TestDao.class);
//		return lubanFactoryBean;
//	}




	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
		return factoryBean.getObject();
	}

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource
				= new DriverManagerDataSource();


		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("aaa111");

		return dataSource;
	}
}

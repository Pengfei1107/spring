package com.resource.test;

import com.resource.bean.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLife {
	public static void main(String[] args) {

		/**
		 * spring容器对象 AnnotationConfigApplicationContext 被实例化了 然后执行refresh方法进行初始化
		 * 1、扫描包--beanDefine --put bdmap
		 * 2、变量这个bdmap 依次获取 beanDefinition对象
		 * 3、去解析---吧beandefinition对象当中描述bean的信息得到
		 * 4、validate 验证是否单例 是否抽象 是否factoryBean 是否被创建。。。
		 * 5、得到class的对象
		 * 6、推断构造方法  一个类可以提供多个构造方法 spring自实例化bean的时候需要用哪个构造方法
		 * 7、得到一个构造方法--通过反射然后直接实例化这个对象（这个时候还不是一个bean）
		 * 8、做一个循环依赖的判断然后对喜欢依赖提供支持
		 * 9、合并beanDefinition（不需要关心）
		 * 10、判断当前容器是否需要完成自动注入 程序员可以扩展的
		 * 11、如果需要完成注入 完成属性填充---自动注入
		 * 12、执行部分的aware接口(很多的Aware 这里不会全部执行 只会执行一部分)
		 * 13、(BeanPostProcessor before)执行部分生命周期的初始化回调(注解版本) 执行部分Aware接口的回调
		 * 14、执行接口版的生命周期回调
		 * 15、(BeanPostProcessor after) 完成的事件发布  完成aop的代理
		 */
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		//spring bean
		// 他存在spring容器当中
		//他有一系列spring的生命周期
		/**
		 * 关于spring 容器先搞明白单例池
		 * 单例池---你们理解的spring容器
		 * this.singletonObjects.get("x")=map.get(key);
		 * 所谓我们认为的spring容器是不是就是 singletonObjects 这个map？
		 * singletonObjects 他一个map他属于spring容器的一部分
		 * 叫做单例池
		 */
//		X x = (X) ac.getBean("x");
//		x.testAop();

		//x1 java对象  他不一定存在spring当中
		//他没有spring bean的生命周期
		//X x1 = new X();


		//ac.getBean(C.class).methodc();
		ac.getBean(X.class).testAop();
	}
}

package com.resource.bean;

import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * 一般用注解标识的bean（或者用xml定义的bean）他的注入模型=0=AUTOWIRE_NO
 * 表示不自动注入 怎么把Z 注入进来呢？手动注入
 * 1、手动注入方式 xml 需要显示在xml配置<property>
 * 2、手动加上@Autowired
 * 关于spring的自动注入有几种方式（variants）如何理解variants
 * 1、Constructor-based dependency injection   基于构造方法的自动注入
 * 2、Setter-based dependency injection 基于setter方法的自动注入
 * 	  如果你的bean的注入模型为默认的，则不会触发Setter方式的注入
 * 	  如果你的bean的注入模型是2-AUTOWIRE_BYTYPE或者1AUTOWIRE_BYNAME 都会触发setter方法
 * 	  如果@Autowired 他是不会触发setter 他怎么赋值的 filed.set
 * 	  他怎么找到需要赋值的对象 通过名字和通过类型
 */

public class Y {


	/**
	 * 先根据类型  找到2个C 他会根据名字取过滤
	 */

	C c1;


	public Y(){
		System.out.println("y");
	}

	public void printf(){
		System.out.println(c1);
	}


	public void setZ(Z z)  {
//		Field z1 = this.getClass().getDeclaredField("z");
//
//		z1.setAccessible(true);
//
//		z1.set(this,new Z());
//
//
//
//		System.out.println("setter");
		//this.z = z;
	}
}

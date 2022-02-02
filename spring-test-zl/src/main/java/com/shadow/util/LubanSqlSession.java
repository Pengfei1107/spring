package com.shadow.util;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LubanSqlSession {

	public static Object getMapper(Class clazz){
		//Object  impl  ?
		Class[] classes = new Class[]{clazz};
		/**
		 * 产生了一个对象
		 * 调用任何方法都会调用 LubanInvocationHandler。invoke
		 */
		Object proxy = Proxy.newProxyInstance(LubanSqlSession.class.getClassLoader(), classes, new LubanInvocationHandler());
		return proxy;
	}




	static class LubanInvocationHandler implements InvocationHandler {
		/**
		 * conn
		 * exe sql
		 * @param proxy
		 * @param method
		 * @param args
		 * @return
		 * @throws Throwable
		 */
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("------conn  jdbc------");
			if(!method.getName().equals("toString")) {
				Select select = method.getAnnotation(Select.class);
				String sql = select.value()[0];
				System.out.println("------exe  sql = ------" + sql);
			}
			return null;
		}
	}
}

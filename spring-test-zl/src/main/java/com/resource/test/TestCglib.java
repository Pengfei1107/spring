package com.resource.test;

import com.resource.bean.CGLIBBean;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author 钢牌讲师--子路
 **/
public class TestCglib {
	public static void main(String[] args) {

		Enhancer enhancer = new Enhancer();
		//将来有一天你返回出来的代理对象需要代理谁----继承谁
		enhancer.setSuperclass(CGLIBBean.class);
		enhancer.setUseFactory(false);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
		enhancer.setCallback(new CallbackCustom());
		CGLIBBean cglibBean = (CGLIBBean) enhancer.create();

		cglibBean.print();

	}
}

class CallbackCustom implements MethodInterceptor{
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		//调用了父类的方法
		Object returnVal = methodProxy.invokeSuper(o, objects);
		//代理逻辑
		System.out.println("cglib proxy logic");
		return returnVal;
	}
}

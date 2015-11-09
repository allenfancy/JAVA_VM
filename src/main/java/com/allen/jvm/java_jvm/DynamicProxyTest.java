package com.allen.jvm.java_jvm;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public class DynamicProxyTest {

	private List<String> list;

	interface IHello{
		void sayHello();
	}
	
	static class Hello implements IHello{

		public void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("Hello world");
		}
	}
	
	static class DynamicProxy implements InvocationHandler{

		Object orinianlObj;
		
		Object bind(Object orinianlObj){
			this.orinianlObj = orinianlObj;
			return Proxy.newProxyInstance(orinianlObj.getClass().getClassLoader(), orinianlObj.getClass().getInterfaces(), this);
		}
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			// TODO Auto-generated method stub
			System.out.println("welcome");
			return method.invoke(orinianlObj, args);
		}
		
	}
	
	
	public static String method(List<String> list){
		//this.list = list;
		return "1";
		
	}
	public static  int method1(List<Integer> list){
		return 1;
	}
	
	public static void main(String[] args){
		IHello hello = (IHello) new DynamicProxy().bind(new Hello());
		hello.sayHello();
	}
	
	
}

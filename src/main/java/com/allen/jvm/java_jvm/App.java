package com.allen.jvm.java_jvm;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Map<String, String> maps = System.getenv();
		Properties p = System.getProperties();

		for (Map.Entry<Object, Object> entry : System.getProperties().entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		
		
		App app = new App();
		Class c = app.getClass();
		ClassLoader loader = c.getClassLoader();
		System.out.println(loader);
		System.out.println(loader.getParent());
		System.out.println(loader.getParent().getParent());
	}
}

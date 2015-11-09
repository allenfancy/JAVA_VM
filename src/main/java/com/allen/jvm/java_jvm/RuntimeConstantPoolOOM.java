package com.allen.jvm.java_jvm;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author allen
 *VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 *
 *运行时常量池导致的内存溢出
 *
 *
 */
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		//使用List保持着常量池引用，避免Full GC回收常量池行为
		List<String> list = new ArrayList<String>();
		int i = 0;
		while (true) {
			list.add(String.valueOf(i).intern());
		}
	}
}

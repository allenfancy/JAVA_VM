package com.allen.jvm.java_jvm;

public class JavaVMStackSOF {

	private int stackLength = -1;

	public void stackLeak() {
		stackLength++;
		stackLeak();
	}

	public static void main(String[] args) throws Throwable {
		JavaVMStackSOF js = new JavaVMStackSOF();
		try {
			js.stackLeak();
		} catch (Throwable e) {
			System.out.println(js.stackLength);
			throw e;
		}
	}
}

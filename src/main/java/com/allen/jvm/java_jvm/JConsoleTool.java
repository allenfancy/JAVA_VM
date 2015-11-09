package com.allen.jvm.java_jvm;

import java.util.ArrayList;
import java.util.List;

public class JConsoleTool {

	static class OOMObject{
		public byte[] placeholder = new byte[64 *1024];
		
	}
	
	public static void fillHeap(int num) throws InterruptedException{
		List<OOMObject> list = new ArrayList<OOMObject>();
		for(int i = 0;i < num; i++){
			//Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.out.println(list.size());
		//System.gc();
	}
	
	public static void main(String[] agrs) throws InterruptedException{
		fillHeap(10000);
	}
}


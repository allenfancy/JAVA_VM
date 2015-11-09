package com.allen.jvm.java_jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

	static class OOMObject{
		
	}
	
	public static void main(String[] agrs){
		List<OOMObject> lists = new ArrayList<OOMObject>();
		while(true){
			lists.add(new OOMObject());
		}
	}
}

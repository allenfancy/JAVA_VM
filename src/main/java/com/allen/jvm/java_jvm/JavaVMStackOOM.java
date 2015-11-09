package com.allen.jvm.java_jvm;

public class JavaVMStackOOM {

	private void donotStop(){
		while(true){
			
		}
	}
	
	private void testThread(){
		while(true){
			new Thread(new Runnable(){

				public void run() {
					// TODO Auto-generated method stub
					donotStop();
				}
				
			}).start();
		}
	}
	
	public static void main(String[] args){
		JavaVMStackOOM oom = new  JavaVMStackOOM();
		//oom.testThread();
	}
}

package com.bit.thread;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

class Ex100 extends Thread{
	static int result;
	int start;
	int end;
	
	public Ex100(int start, int end) {
		this.start=start;
		this.end=end;
	}
	//
//	public synchronized void minus(int su){
//		//~~~~
//	}
	
	// 임계영역
	// 메서드 동기화
//	public synchronized void plus(int su){
////		result+=su;
//		int hap=0;
//		hap=result+su;
//		result=hap;
//	} 
	// 블럭동기화
	public void plus(int su){
//		result+=su;
		int hap=0;
		synchronized (this){
			hap=result+su;
			result=hap;
		}
	} 
	static Object key=new Object();
	public void minus(int su){
//		result+=su;
		int hap=0;
		synchronized (key){
			hap=result-su;
			result=hap;
		}
	}
	
	public void run() {
		for(int i=start; i<end+1; i++){
			plus(i);
			System.out.println(this.getName()+"연산 중...");
		}
		System.out.println(result);
	}
	
}

public class Ex01 {
	// 500500
	public static void main(String[] args) {
		Ex100 ex100=new Ex100(1,50);
		Ex100 ex200=new Ex100(51,100);
		ex100.start();
		ex200.start();
		try {
			ex100.join();
			ex200.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}





















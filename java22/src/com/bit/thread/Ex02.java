package com.bit.thread;

public class Ex02 implements Runnable{

	public static void main(String[] args) {
		
		Ex02 me = new Ex02();
		
		Thread thr1=new Thread(me);
		Thread thr2=new Thread(me);
		thr1.start();
		thr2.start();

	}

	public void run() {
		System.out.println("새로운 스레드 시작");
		for(int i=0; i<10; i++){
		System.out.println("새로운 작업수행...");
		}
		System.out.println("새로운 스레드 종료");
	}

}

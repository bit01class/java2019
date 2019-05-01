package com.bit.thread;

public class Ex01 extends Thread{

	public static void main(String[] args) {
		System.out.println("메인시작");
		Ex01 me = new Ex01();
		me.start();
		System.out.println("메인종료");
	}
	
	public void run(){
		System.out.println("새로운 스레드 시작");
		int sum=0;
		for(int i=0; i<10000000; i++){
			sum+=i;
		}
		System.out.println("sum="+sum);
		System.out.println("새로운 스레드 종료");
	}

}

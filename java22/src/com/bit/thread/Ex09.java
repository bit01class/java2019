package com.bit.thread;

public class Ex09 extends Thread{

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("메인 순위:"+main.getPriority());
		Ex09 me =new Ex09();
		Ex09 you=new Ex09();
		Ex09 you2=new Ex09();
		System.out.println(me.getPriority());
		me.setName("me");
		you.setName("you");
		you2.setName("you2");
		
		me.setPriority(Thread.MAX_PRIORITY); // 1~10
		you.setPriority(6);// 5
		you.setPriority(Thread.NORM_PRIORITY);// 5
		you2.setPriority(Thread.MIN_PRIORITY);// 1
		me.start();
		you.start();
		you2.start();

	}

	public void run(){
		System.out.println(getName()+"스레드 시작");
		for(int i=0; i<5; i++){
			System.out.println(getName()+" working...");
		}
		System.out.println(getName()+"스레드 종료");
	}
}

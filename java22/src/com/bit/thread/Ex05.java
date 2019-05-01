package com.bit.thread;

public class Ex05 extends Thread{

	public static void main(String[] args) {
		Thread current = Thread.currentThread();
		String name=current.getName();
		System.out.println(name+"스레드 시작");
		Ex05 me = new Ex05();
		Ex05 you= new Ex05();
		me.setName("me");
		you.setName("you");
		me.start();
		you.start();
		System.out.println(name+"스레드 종료");
	}
	
	public void run(){
		String name=this.getName();
		System.out.println(name+"스레드 시작");
		for(int i=0; i<10; i++){
			System.out.println(name+" working...");
		}
		System.out.println(name+"스레드 종료");
	}

}








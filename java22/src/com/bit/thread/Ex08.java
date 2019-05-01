package com.bit.thread;

public class Ex08 extends Thread{

	public static void main(String[] args) {
		System.out.println("main ����");
		Ex08 thr1=new Ex08();
		Ex08 thr2=new Ex08();
		thr1.start();
		thr2.start();
		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main ����");
	}

	
	public void run(){
		System.out.println(getName()+"����");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+"����");
	}
}

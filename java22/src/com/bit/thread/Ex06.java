package com.bit.thread;

public class Ex06 implements Runnable{

	public static void main(String[] args) {
		System.out.println("main ������ ����");
		Ex06 me = new Ex06();
		
		Thread thr1=new Thread(me,"ù��°");
		Thread thr2=new Thread(me,"�ι�°");
		System.out.println(thr1.getName());
		System.out.println(thr2.getName());
		thr1.start();
		thr2.start();
		
		System.out.println("main ������ ����");
	}

	public void run(){
		Thread me = Thread.currentThread();
		String name=me.getName();
		System.out.println(name+"������ ����");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"������ ����");
	}
}
















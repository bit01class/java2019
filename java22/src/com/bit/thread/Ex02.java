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
		System.out.println("���ο� ������ ����");
		for(int i=0; i<10; i++){
		System.out.println("���ο� �۾�����...");
		}
		System.out.println("���ο� ������ ����");
	}

}

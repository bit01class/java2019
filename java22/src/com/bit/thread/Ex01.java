package com.bit.thread;

public class Ex01 extends Thread{

	public static void main(String[] args) {
		System.out.println("���ν���");
		Ex01 me = new Ex01();
		me.start();
		System.out.println("��������");
	}
	
	public void run(){
		System.out.println("���ο� ������ ����");
		int sum=0;
		for(int i=0; i<10000000; i++){
			sum+=i;
		}
		System.out.println("sum="+sum);
		System.out.println("���ο� ������ ����");
	}

}

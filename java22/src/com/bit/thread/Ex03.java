package com.bit.thread;

class Ex33 extends Thread{
	public void run(){
		System.out.println("2�������� ����");
		for(int i=0; i<100; i++){
			System.out.println("2�� working...");
		}
		System.out.println("2�������� ����");
		
	}
}

public class Ex03 extends Thread {

	public static void main(String[] args) {
		Ex03 me = new Ex03();
		Ex33 you= new Ex33();
		me.start();
		you.start();
	}
	
	public void run(){
		System.out.println("1�������� ����");
		for(int i=0; i<100; i++){
			System.out.println("1�� working...");
		}
		System.out.println("1�������� ����");
	}

}

package com.bit.thread;

class Ex201 extends Thread{
	boolean boo=true;
	boolean pass;
	
	public void run() {
		while(boo){
			if(!pass){
			System.out.println(getName()+"������ ���ϴ���...");
			}else{
				Thread.yield();// runnable���·� ����
			}
		}
		System.out.println(getName()+"����");
	}
}

class Ex202 extends Thread{
	boolean boo=true;
	boolean pass;
	
	public void run() {
		while(boo){
			if(!pass){
			System.out.println(getName()+"������ ���ϴ���...");
			}else{
				Thread.yield();// runnable���·� ����
			}
		}
		System.out.println(getName()+"����");
	}
}

public class Ex02 {
	

	public static void main(String[] args) {
		Ex201 ex1=new Ex201();
		Ex202 ex2=new Ex202();
		ex1.setName("1��");
		ex2.setName("2��");
		ex1.start();
		ex2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex1.pass=true;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex2.pass=true;
		ex1.pass=false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex1.boo=false;
		ex2.pass=false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ex2.boo=false;

	}

}

















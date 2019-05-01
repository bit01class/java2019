package com.bit.thread;

public class Ex07 extends Thread{

	public static void main(String[] args) {
		Ex07 me =new Ex07();
		Ex07 you=new Ex07();
		me.start();
		you.start();
	}

	public void run(){
		for(int i=1; i<100; i++){
			System.out.println(getName()+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

package com.bit.thread;

class Ex205 extends Thread{
	public void run() {
			synchronized (this) {
				System.out.println("�Ͻ�����");
				
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("������");				
			}
		
	};
}

public class Ex05 {

	public static void main(String[] args) {
		Ex205 you = new Ex205();
		you.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (you) {
			you.notify();
		}
	}

}


















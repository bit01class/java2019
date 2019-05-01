package com.bit.thread;

class Ex204 extends Thread{
	
	public void run() {
		try {
			while(true){
				System.out.println("일하는 중...");
					Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("일과 종료");
	}
	
}


public class Ex04 {

	public static void main(String[] args) {
		Ex204 you = new Ex204();
		you.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		you.interrupt();
	}

}




















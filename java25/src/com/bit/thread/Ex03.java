package com.bit.thread;

class Ex203 extends Thread{
	
	public void run() {
		int a=0;
		while(true){
			System.out.println(++a+" working");
		}
	};
}

public class Ex03 {

	public static void main(String[] args) {
		Ex203 you=new Ex203();
		
		you.start(); // 시작
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		you.suspend(); // 일시정지
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		you.resume(); // 재시작
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		you.stop(); // 종료
	}

}























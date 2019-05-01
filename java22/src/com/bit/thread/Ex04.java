package com.bit.thread;

public class Ex04{

	public static void main(String[] args) {
		
		
		Thread thr1=new Thread(){
			
			public void run() {
				System.out.println("Ex04 thread start");
				for(int i=0; i<50; i++){
					System.out.println("Ex04 thread working...");
				}
				System.out.println("Ex04 thread end");
			}
		};
		Thread thr2=new Thread(){
			
			public void run() {
				System.out.println("Ex44 thread start");
				for(int i=0; i<50; i++){
					System.out.println("Ex44 thread working...");
				}
				System.out.println("Ex44 thread end");
			}
		};
		thr1.start();
		thr2.start();
	}

}












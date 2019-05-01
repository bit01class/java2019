package com.bit.thread;

/*
 * NEW
	A thread that has not yet started is in this state.
 * RUNNABLE
	A thread executing in the Java virtual machine is in this state.
 * BLOCKED
	A thread that is blocked waiting for a monitor lock is in this state.
 * WAITING
	A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
 * TIMED_WAITING
	A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
 * TERMINATED
	A thread that has exited is in this state.
 * */

public class Ex07 extends Thread {

	public static void main(String[] args) {
		System.out.println("메인스레드 시작");
		Ex07 me=new Ex07();
		System.out.println(me.getState());
		
		//me.setDaemon(true); // 데몬 스레드로..
		me.start();
		for(int i=0; i<50; i++){
			System.out.println(me.getState());
		}
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println(me.getState());
		System.out.println("메인스레드 종료");
	}
	
	
	public void run() {
//		while(true){
			System.out.println(getName()+" 일하는 중...");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		}
	}
}



















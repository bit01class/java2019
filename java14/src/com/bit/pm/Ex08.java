package com.bit.pm;

interface Machine2{
	void on();
	void off();
}

class Tv2 implements Machine2{
	public void on(){
		System.out.println("tv�Ѵ�");
	}
	public void off(){
		System.out.println("tv����");
	}
} 

class Radio2 implements Machine2{

	public void on() {
		System.out.println("���� �Ѵ�");
	}

	public void off() {
		System.out.println("���� ����");
	}
	
}


public class Ex08 {

	public static void main(String[] args) {
		Machine2 remote=new Radio2();
		remote.on();
		remote.off();
	}

}

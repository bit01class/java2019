package com.bit.pm;

interface Machine2{
	void on();
	void off();
}

class Tv2 implements Machine2{
	public void on(){
		System.out.println("tv켜다");
	}
	public void off(){
		System.out.println("tv끄다");
	}
} 

class Radio2 implements Machine2{

	public void on() {
		System.out.println("라디오 켜다");
	}

	public void off() {
		System.out.println("라디오 끄다");
	}
	
}


public class Ex08 {

	public static void main(String[] args) {
		Machine2 remote=new Radio2();
		remote.on();
		remote.off();
	}

}

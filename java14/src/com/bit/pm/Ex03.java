package com.bit.pm;

abstract class Machine{
	public abstract void on();
	public void off(){
		System.out.println("끄다");
	}
}

class Tv extends Machine{
	public void on(){
		System.out.println("화면을 출력한다");
	}
}

class Radio extends Machine{
	public void on(){
		System.out.println("주파수를 잡아 소리를 낸다");
	}
}

class Audio extends Machine{
	public void on(){}
}

public class Ex03 {

	public static void main(String[] args) {
		Machine romote=new Audio();
		romote.on();
		romote.off();

	}

}


















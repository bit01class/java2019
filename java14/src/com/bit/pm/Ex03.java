package com.bit.pm;

abstract class Machine{
	public abstract void on();
	public void off(){
		System.out.println("����");
	}
}

class Tv extends Machine{
	public void on(){
		System.out.println("ȭ���� ����Ѵ�");
	}
}

class Radio extends Machine{
	public void on(){
		System.out.println("���ļ��� ��� �Ҹ��� ����");
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


















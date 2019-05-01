package com.bit.pm;

abstract class Ex55{
	
	public Ex55() {
		super();
		System.out.println("create Ex55 class");
	}
	abstract void func01();
}

public class Ex05 extends Ex55 {
	
	public Ex05() {
		super();
		System.out.println("create Ex05 class...");
	}
	
	void func01(){
		System.out.println("func01()...");
	}

	public static void main(String[] args) {
		Ex55 you=new Ex05();
		you.func01();
		Ex05 me = new Ex05();
		me.func01();
	}

}

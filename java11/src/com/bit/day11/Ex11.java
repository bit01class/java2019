package com.bit.day11;

public class Ex11 {
	static int num2=2222;
	int num1;
	
	public Ex11() {
//		super();
//		this(2222);
		num1=2222;
		System.out.println("梓端 持失");
	}
	public Ex11(int s) {
//		super();
		num1=s;
		System.out.println("梓端 持失");
	}

	public static void main(String[] args) {
		// 
		Ex11 me = new Ex11();
		System.out.println(me.num2);
		me.num2++;
		Ex11 you = new Ex11();
		System.out.println(you.num2);
		System.out.println(me.num2);
	}
	
	static void func03(){
		//System.out.println(this);
	}
	
	void func01(){
		System.out.println(this);
		System.out.println("non-static func01()...");
		this.func02();
	}
	
	void func02(){
		System.out.println("non-static func02()...");
	}
	

}

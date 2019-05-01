package com.bit.day10;

class Ex111{
	
	public Ex111(int a) {
		super();
		System.out.println(a+"부모객체 생성...");
	}
	
	void func01(){
		System.out.println("부모클래스의 기능");
	}
}

public class Ex10 extends Ex111 {
	
	public Ex10() {
		//super(1111);
		this(2222);
		System.out.println("자식객체 생성...");
	}
	
	public Ex10(int a){
		super(a);
		System.out.println("param a="+a+"를 받는 생성자 호출");
	}
	

	public static void main(String[] args) {
		Ex10 me= new Ex10();
		me.func01();
	}
	
	public void func01(){
		super.func01();
		System.out.println("자식클래스의 기능");
	}

}















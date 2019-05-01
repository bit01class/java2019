package com.bit.pm;

abstract class Ex22{
	// 추상클래스는 추상 메서드를 0개이상 갖는 클래스
	int a=1;
	
	public Ex22() {
	}
	
	public void func01(){
		System.out.println("func01()...");
	}
	
	public abstract void func02(); // 추상메서드- 메서드의 선언만있고 구현없음
}


public class Ex02 extends Ex22 {

	public void func02(){
		System.out.println("바뀐 기능....");
	}
	
	public static void main(String[] args) {
//		Ex22 you=new Ex22();
//		you.func01();
		Ex02 me=new Ex02();
//		me.func02();
	}

}

/*
non-static method (인스턴스 메서드, 멤버 메서드)
1. static method에서 non-static method call 객체생성 후 
	참조변수.메서드명();(참조변수를 이용해서 접근)
2. non-static method에서 non-static method call
	메서드명();
3. static method에서 static method call
	메서드명();
4. non-static method에서 static method call
	메서드명();
*/


package com.bit.day06;


public class Ex03{

  public static void main(String[] args){
	Ex03 me;		//변수의 선언
	me = new Ex03();	//초기화(객체 생성)
	me = new Ex03();
	me.func01(); // 생성된 객체의 func01메서드 수행
	//me.func02();
	//func03();
  }

  public void func01(){
	System.out.println("func01의 기능입니다");
	//func02();
	func03();
	return;
  }

  public void func02(){
	System.out.println("func02의 기능입니다");
  }

  public static void func03(){
	//Ex03 you = new Ex03();
	//you.func02();
	System.out.println("static method 입니다");
  }

}










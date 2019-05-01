package com.bit.day10;

class Ex09{

  public static void main(String[] args){
	Ex09 me = new Ex09();
	me.func01();
  }

  public void func01(){
	System.out.println("부모클래스의 기능");
  }

  public void func03(){
	System.out.println("부모클래스 기능");
  }

}

public class Ex08 extends com.bit.day10.Ex09{
  int su1=1234;

  public static void main(String[] args){

	Ex08 me = new Ex08();
	me.func01();
	me.func02();
	//Ex08.func03();//(x)
	//Ex09.func03();//(o)
	me.func03();

  }

  public void func02(){
	System.out.println("자식클래스의 기능");
  }

  public void func03(){
	System.out.println("메서드 오버라이드...");
  }

}













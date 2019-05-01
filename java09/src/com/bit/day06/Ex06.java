package com.bit.day06;

public class Ex06{
  static int num1=100;
  int num2=200;

  public static void main(String[] args){
	int num1;
	num1=1234;
	System.out.println("num1="+num1);
	Ex06 me =new Ex06();
	int num2=1234;
	System.out.println("num2="+me.num2);	
	System.out.println("-----------------------");
	me.func01();
  }

  public void func01(){
	System.out.println("num1="+num1);
	int num2=4321;
	System.out.println("num2="+num2);
	func02();
	System.out.println("num2="+num2);
  }

  public void func02(){
	System.out.println("func02 num2="+num2);
  }


}












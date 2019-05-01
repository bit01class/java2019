package com.bit.day08;

public class Ex03{
	 int su;
/*
	디폴트생성자 생략가능
	생성자 존재하지 않을 시, 자동생성 안함
*/
  public Ex03(){
	su=1234;
	System.out.println("su="+su);
  }
  
  public Ex03(int a){
	su=a;
	System.out.println("su="+su);
  }


  public static void main(String[] args){
	String msg1="";
	String msg2=new String();
	System.out.println(msg2);

	Ex03 me=new Ex03(5678);
  }

  public void func01(){
	System.out.println("기능수행");
	return;
  }
}








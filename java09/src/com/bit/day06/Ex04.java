package com.bit.day06;

public class Ex04{

  public static void main(String[] args){
	java.util.Scanner sc=null;
	int su=0;
	while(true){
		sc=new java.util.Scanner(System.in);
		try{
			su=sc.nextInt();
		}catch(Exception e){}
		System.out.println("su="+su);
	}
  }

  public void func01(){
	System.out.println("non-static method...");
  }

  public int func02(String msg){
	System.out.println("non-static method return int"+msg);
	return 100;
  }

  public void func03(Ex04 you){
	System.out.println("non func03 run...");
	you.func01();
  }
}












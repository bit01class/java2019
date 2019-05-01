package com.bit.pm;

interface Ex666{
	void func03();
}

interface Ex66 extends Ex06,Ex666{
	public final int su=1234;
	int su2=1234;
	
	void func02();
	public void func03();
}

public class Ex07 extends Object implements Ex66{

	public void func02(){}
	public void func03(){}
	
	public void func01(){
		System.out.println("func01()...");
	}
	
	public static void main(String[] args) {
		Ex07 me = new Ex07();
		me.func01();
		me.func02();
		me.func03();
		Ex06 you=new Ex07();
		you.func01();
//		you.func02();
//		you.func03();
		Ex66 you2=new Ex07();
//		you2.func01();
		you2.func02();
		you2.func03();
//		you2.su++;
		System.out.println(you2.su);
	}

}

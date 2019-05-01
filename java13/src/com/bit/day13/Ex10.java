package com.bit.day13;

class Father extends Object{
	int su=4321;
	
	public String toString(){
		return "아빠다";
	}
}

public class Ex10 extends Father{
	int su=1234;

	public static void main(String[] args) {
		// 상속 - 다형성
		Ex10 me = new Ex10();
		System.out.println(me);
		
		Father me2=me;	// (Father)me;
		System.out.println(me2.toString());
		System.out.println(me2.su);
		
		Ex10 me3=(Ex10)me2;
		System.out.println(me3.toString());
		System.out.println(me3.su);
		
		Object obj=1;
		int su=(Integer)obj;
	}
	
	public String toString(){
		return "나야나";
	}

}




















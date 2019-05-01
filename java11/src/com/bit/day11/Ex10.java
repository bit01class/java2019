package com.bit.day11;
class Ex110{
	static int num1=1010;
}
public class Ex10{
	static int num1=1111;// 스태틱변수,클래스변수...

	public static void main(String[] args) {
		int num1=2222;
		System.out.println(com.bit.day11.Ex10.num1);
		System.out.println(Ex10.num1);
		System.out.println(Ex110.num1);
		System.out.println(num1);
		
//		com.bit.day11.Ex10.func01();
//		Ex10.func01();
//		func01();
//		func02(1234);
//		double su=func03();
//		System.out.println(su);
	}
	
	public static void func01(){
		System.out.println("static method func01...");
		return;
	}
	
	public static double func03(){
		return 3.14;
	}
	
	public static void func02(int a){
		System.out.println(a);
		com.bit.day11.Ex10.func01();
	}

}

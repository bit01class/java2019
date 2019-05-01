package com.bit.pm;

public class Ex03 {
	static int su1=1000;
	
	static class Inner1{
		public static int su1=1111;
		public int su2=2222;
		
//		public Inner1() {
//			System.out.println("내부클래스 객체 생성");
//		}
		
		public static void func01(){
			System.out.println("Inner-static-func01");
		}
		
		public void func02(){
			System.out.println("Inner-non-func02");
		}
		
	}
	

	public static void main(String[] args) {
		System.out.println("su1="+Ex03.su1);
		System.out.println("inner-su1="+Ex03.Inner1.su1);
		Ex03.Inner1.func01();
		
		Ex03.Inner1 inn=new Inner1();
		System.out.println("inner-su2="+inn.su2);
		inn.func02();
	}

}



















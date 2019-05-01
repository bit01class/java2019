package com.bit.pm;

public class Ex05 {
	int su=111;
	class Inner02{
		int su1=1111;
//		static int su2=2222;//불가
		final static int su3=3333;
		
		public Inner02() {
			System.out.println("생성자 호출");
		}
		
		public void func01(){
			System.out.println("non-static func01()...");
		}
//		public static void func02(){}//불가
	}

	public static void main(String[] args) {
		Ex05 me=new Ex05();
		
		Inner02 inn=null;
		inn=me.new Inner02();
		System.out.println(inn.su1);
		System.out.println(Inner02.su3);
		inn.func01();
	}

}













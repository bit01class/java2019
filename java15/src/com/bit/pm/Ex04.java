package com.bit.pm;



public class Ex04 {

	public static void main(String[] args) {
		int su=Ex03.Inner1.su1;
		System.out.println(su);
		Ex03.Inner1.func01();
		
		Ex03.Inner1 inn = new Ex03.Inner1();
		System.out.println(inn.su2);
		inn.func02();
		
	}

}

package com.bit.pm;

public class Ex06 {

	public static void main(String[] args) {
		Ex05 you=new Ex05();
		Ex05.Inner02 you2=you.new Inner02();
		System.out.println(you2.su1);
		System.out.println(Ex05.Inner02.su3);
		you2.func01();
	}

}

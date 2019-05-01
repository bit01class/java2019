package com.bit.am;

public class Ex02 {

	public static void main(String[] args) {
		String msg="abcdefg";
		System.out.println("abcdefg".length());
		String msg2="abc".concat("de").concat("fg");
		String msg3="abc"+"de"+"fg";
		System.out.println(msg2);
		
		Ex02 me =new Ex02();
		me.func(100).func(101).func(102).func(103).func(1034);
		
	}
	
	public Ex02 func(int a){
		System.out.print('+');
		System.out.print(a);
		return this;
	}

}

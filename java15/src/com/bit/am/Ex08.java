package com.bit.am;

public class Ex08 {

	public static void main(String[] args){
		System.out.println("메인 시작");
		
		try{
		func01(1);
		func01(0);
		func01(-1);
		}catch(ArithmeticException e){
			System.out.println("해결");
		}
		System.out.println("메인 종료");
	}
	
	public static void func01(int a) throws ArithmeticException{
		System.out.println("메서드 시작");
		ArithmeticException excep=new ArithmeticException();
		throw excep;
//		System.out.println("메서드 종료");
	
	}

}













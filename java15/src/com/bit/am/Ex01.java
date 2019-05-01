package com.bit.am;

public class Ex01 {

	public static void main(String[] args) {
		// ¿¹¿Ü
		System.out.println("before try...");
//		try{
			System.out.println("start try...");
			int a=5/0;
			System.out.println("5/0...");
			System.out.println(a);
			System.out.println("end try...");
//		}catch(java.lang.ArithmeticException ex){
//			System.out.println("catch...");
//		}
		System.out.println("end try catch...");

	}

}





















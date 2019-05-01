package com.bit.am;

public class Ex02 {

	public static void main(String[] args) {
		
		
		int a=0;
		System.out.println("before for");
		try{
			for(int i=-3; i<4; i++){
				System.out.println("for top");
						a=5/i;
						System.out.println("5/"+i+"="+a);				
				System.out.println("for down");
			}
		}catch(ArithmeticException e){
			System.out.println("err");				
		}
		System.out.println("a="+a);
	}

}









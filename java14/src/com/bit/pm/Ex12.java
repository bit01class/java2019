package com.bit.pm;

public class Ex12 {

	public static void main(String[] args) {
		String msg="1,000";
		try{
			int su=Integer.parseInt(msg);
			System.out.println("su="+su);
		}catch(NumberFormatException e){
			System.out.println("에러발생");
		}
		System.out.println("main end");
		
	}

}

package com.bit.am;
/*
 * int a=5;
 * 
 * a/i
 * 
 * 5/-3=-1
 * 5/-2=-2
 * 5/-1=-5
 * 5/0=0
 * 5/1=5
 * 5/2=2
 * 5/3=1
 * 
*/
public class Ex03 {

	public static void main(String[] args) {
		int a=5;
		int result=0;
		
		for(int i=-3; i<4; i++){
			try{
				result=a/i;
			}catch(ArithmeticException e){
				result=0;
			}
			System.out.println(a+"/"+i+"="+result);
		}
		
	}

}













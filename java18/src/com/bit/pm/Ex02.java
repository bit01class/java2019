package com.bit.pm;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		for(int i=0; i<1000000; i++){
			java.util.Calendar obj = Calendar.getInstance();
		System.out.print(obj.get(Calendar.YEAR)+".");
		System.out.print(1+obj.get(Calendar.MONTH)+".");
		System.out.println(obj.get(Calendar.DATE));
//		if(obj.get(Calendar.AM_PM)==0){
//		System.out.print("a.m");
//		}else{
//		System.out.print("p.m ");
//		}
//		System.out.print(obj.get(Calendar.HOUR)+":");
		System.out.print(obj.get(Calendar.HOUR_OF_DAY)+":");
		
		System.out.print(obj.get(Calendar.MINUTE)+":");
		System.out.println(obj.get(Calendar.SECOND));
		}
	}

}













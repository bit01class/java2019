package com.bit.pm;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex03 {

	public static void main(String[] args) {
		GregorianCalendar cal = null;
		cal = new GregorianCalendar(2019,2,27);
		int before=cal.get(Calendar.DAY_OF_YEAR);
		cal = new GregorianCalendar();
		int now=cal.get(Calendar.DAY_OF_YEAR);
		
		
		
		
//		cal = new GregorianCalendar(2019,8,25);
//		int after=cal.get(Calendar.DAY_OF_YEAR);
//		
//		
//		System.out.println("������ "+(now-before)+"��°");
//		System.out.println(after-now+"�� ����");
		

//		System.out.print(cal.get(Calendar.YEAR)+".");
//		System.out.print(1+cal.get(Calendar.MONTH)+".");
//		System.out.print(cal.get(Calendar.DATE));
//		char ch=0;
//		switch(cal.get(Calendar.DAY_OF_WEEK)){
//			case 1: ch='��'; break;
//			case 2: ch='��'; break;
//			case 3: ch='ȭ'; break;
//			case 4: ch='��'; break;
//			case 5: ch='��'; break;
//			case 6: ch='��'; break;
//			case 7: ch='��'; break;
//		}
//		System.out.println("("+ch+")");

	}

}

package com.bit.day10;
/*
래퍼클래스
int - java.lang.Integer
오토랩핑
언랩핑

*/

public class Ex01{

  public static void main(String[] args){

	Integer su1=new Integer(100);
	Integer su2=new Integer("129");

	System.out.println(su2+1);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.SIZE);

	int su3=su2.intValue();
	System.out.println(su3);
	long su4=su2.longValue();
	System.out.println(su4);
	byte su5=su2.byteValue();
	System.out.println(su5);
	int su6=Integer.compare(200,100);
	System.out.println(su6);
	int su7=su2.compareTo(su1);
	System.out.println(su7);
	boolean result=su2.equals(su1);
	System.out.println(result);
	int su8=Integer.parseInt("1234");
	System.out.println(su8+1);
	System.out.println(su2.toString()+1);
	Integer su9=Integer.valueOf(1234);
	System.out.println(su9.toString());
	int su10=su1+su2;
	Integer su11=9999;
	System.out.println(su11);

  }

}
package com.bit.day10;

public class Ex03{

  public static void main(String[] args){
	byte a0=10;
	Byte a1=new Byte(a0);
	Byte a2=new Byte("20");
	System.out.println(a2);
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.SIZE);
	byte a3=Byte.parseByte("127");
	System.out.println(a3);

	System.out.println("----------------------------------");

	short b0=100;
	Short b1=new Short(b0);
	Short b2=new Short("200");
	System.out.println(Short.MIN_VALUE);
	System.out.println(Short.MAX_VALUE);
	System.out.println(Short.SIZE);
	short b3=Short.parseShort("1234");
	System.out.println(b3);

	System.out.println("---------------------------------");

	Long c0=new Long(1000);
	Long c1=new Long(1000L);
	Long c2=new Long("2000");
	long c3=Long.parseLong("3000");
	System.out.println(c3);

  }

}















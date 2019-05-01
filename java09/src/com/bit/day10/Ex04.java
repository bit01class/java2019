package com.bit.day10;

public class Ex04{

  public static void main(String[] args){

	double a1=3.14;
	Double a2=new Double(3.14);
	Double a3=new Double("3.14");
	Double a4=3.14;
	System.out.println("min:"+Double.MIN_VALUE);
	System.out.println("max:"+Double.MAX_VALUE);

	Double a5=5.0/0;
	Double a6=0.0/0;
	System.out.println("5/0 infinite:"+a5.isInfinite());
	System.out.println("5/0 NaN:"+a5.isNaN());
	System.out.println("0/0 infinite:"+a6.isInfinite());
	System.out.println("0/0 NaN:"+a6.isNaN());
  }


}










